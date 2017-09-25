package com.coolweather.app.model;

/**
 * Created by Administrator on 2017/9/25.
 */

public class County {
    private int id;
    private String countyName;
    private String countyCode;
    private int provinceId;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountyName() {
        return countyName;
    }

    public String setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCountyCode() {
        return countyCode;
    }

    public String setCountyCode(String countyCode) {
        this.countyCode = countyCode;
    }

    public String getCityId() {
        return cityId;
    }

    public String setCityId(String cityId) {
        this.cityId = cityId;
    }
}
