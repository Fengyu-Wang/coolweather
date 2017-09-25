package com.coolweather.app.model;

/**
 * Created by Administrator on 2017/9/25.
 */

public class City {
    private int id;
    private String cityName;
    private String cityCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public String setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityCode() {
        return cityCode;
    }

    public String setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public String getProvinceId() {
        return provinceId;
    }

    public String setProvinceId(String provinceId) {
        this.provinceId = provinceId;
    }
}
