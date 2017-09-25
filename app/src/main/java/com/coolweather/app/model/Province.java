package com.coolweather.app.model;

/**
 * Created by Administrator on 2017/9/25.
 */

public class Province {
    private int id;
    private String provinceName;
    private String provinceCode;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public String setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public String setProvinceCode(String provinceCode) {
        this.provinceCode = provinceCode;
    }
}
