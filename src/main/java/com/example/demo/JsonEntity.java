package com.example.demo;

public class JsonEntity {
    DataEntity dataEntity;
    String sign;

    public JsonEntity(DataEntity dataEntity, String sign) {
        this.dataEntity = dataEntity;
        this.sign = sign;
    }

    public DataEntity getDataEntity() {
        return dataEntity;
    }

    public void setDataEntity(DataEntity dataEntity) {
        this.dataEntity = dataEntity;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
