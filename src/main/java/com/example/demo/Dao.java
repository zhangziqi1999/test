package com.example.demo;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface Dao {
    @Insert("insert into data values (#{range}, #{standardValue}, #{taskCode}, #{testValue}, #{instrumentCode}, #{testStandardValue}, #{img}, #{unit}, #{serialNumber})")
    void uploadData(@Param("range") String range, @Param("standardValue") Double standardValue, @Param("taskCode") String taskCode, @Param("testValue") Double testValue, @Param("instrumentCode") String instrumentCode, @Param("testStandardValue") String testStandardValue, @Param("img") String img, @Param("unit") String unit, @Param("serialNumber") String serialNumber);
}
