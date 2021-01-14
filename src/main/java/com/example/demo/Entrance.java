package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import java.io.File;
import java.io.IOException;

@RestController
public class Entrance {
    final static ObjectMapper OBJECT_MAPPER = new ObjectMapper();
    Dao dao;

    @Autowired
    public Entrance(Dao dao) {
        this.dao = dao;
    }

    @PostMapping("/upload")
    String uploadMessage(@RequestBody JsonEntity jsonEntity) throws JsonProcessingException {
        DataEntity dataEntity = OBJECT_MAPPER.readValue(jsonEntity.getObject(), DataEntity.class);
        dao.uploadData(dataEntity.getRange(), dataEntity.getStandardValue(), dataEntity.getTaskCode(), dataEntity.getTestValue(), dataEntity.getInstrumentCode(), dataEntity.getTestStandardValue(), dataEntity.getImg(), dataEntity.getUnit(), dataEntity.getSerialNumber());
        return "ok";
    }

    @GetMapping("/download")
    @CrossOrigin(origins = "*", maxAge = 3600)
    DataEntity[] getMessage(){
        return dao.getData();
    }

    @PostMapping(value = "/fileUpload")
    public String fileUpload(@RequestParam(value = "file") MultipartFile file) {
        String fileName = file.getOriginalFilename();
        System.out.println(fileName);
        String suffixName = null;
        if (fileName != null) {
            suffixName = fileName.substring(fileName.lastIndexOf("."));
        }
        String filePath = "/images/";
        File dest = new File(filePath + fileName);
        if (!dest.getParentFile().exists()) {
            dest.getParentFile().mkdirs();
        }
        try {
            file.transferTo(dest);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return fileName;
    }
}
