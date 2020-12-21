package com.example.demo;

import java.io.Serializable;

public class JsonEntity implements Serializable {
    String object;
    String sign;

    public JsonEntity(String object, String sign) {
        this.object = object;
        this.sign = sign;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }
}
