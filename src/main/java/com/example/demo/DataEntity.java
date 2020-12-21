package com.example.demo;

import java.io.Serializable;

public class DataEntity implements Serializable {
    String range;
    Double standardValue;
    String taskCode;
    Double testValue;
    String instrumentCode;
    String testStandardValue;
    String img;
    String unit;
    String serialNumber;

    public DataEntity(String range, Double standardValue, String taskCode, Double testValue, String instrumentCode, String testStandardValue, String img, String unit, String serialNumber) {
        this.range = range;
        this.standardValue = standardValue;
        this.taskCode = taskCode;
        this.testValue = testValue;
        this.instrumentCode = instrumentCode;
        this.testStandardValue = testStandardValue;
        this.img = img;
        this.unit = unit;
        this.serialNumber = serialNumber;
    }

    public String getRange() {
        return range;
    }

    public void setRange(String range) {
        this.range = range;
    }

    public Double getStandardValue() {
        return standardValue;
    }

    public void setStandardValue(Double standardValue) {
        this.standardValue = standardValue;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public Double getTestValue() {
        return testValue;
    }

    public void setTestValue(Double testValue) {
        this.testValue = testValue;
    }

    public String getInstrumentCode() {
        return instrumentCode;
    }

    public void setInstrumentCode(String instrumentCode) {
        this.instrumentCode = instrumentCode;
    }

    public String getTestStandardValue() {
        return testStandardValue;
    }

    public void setTestStandardValue(String testStandardValue) {
        this.testStandardValue = testStandardValue;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DataEntity{");
        sb.append("range='").append(range).append('\'');
        sb.append(", standardValue=").append(standardValue);
        sb.append(", taskCode='").append(taskCode).append('\'');
        sb.append(", testValue=").append(testValue);
        sb.append(", instrumentCode='").append(instrumentCode).append('\'');
        sb.append(", testStandardValue='").append(testStandardValue).append('\'');
        sb.append(", img='").append(img).append('\'');
        sb.append(", unit='").append(unit).append('\'');
        sb.append(", serialNumber='").append(serialNumber).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
