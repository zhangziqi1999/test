package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

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
    DataEntity[] getMessage(){
        return dao.getData();
    }
}
