package com.krishighar.model;

/**
 * Created by NaRan on 11/17/17 at 07:06.
 */

public class MarketValueModel {

    private String id;

    private String name;

    private String unit;

    private String thokAverage;

    private String khudraAverage;

    private String onDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getThokAverage() {
        return thokAverage;
    }

    public void setThokAverage(String thokAverage) {
        this.thokAverage = thokAverage;
    }

    public String getKhudraAverage() {
        return khudraAverage;
    }

    public void setKhudraAverage(String khudraAverage) {
        this.khudraAverage = khudraAverage;
    }

    public String getOnDate() {
        return onDate;
    }

    public void setOnDate(String onDate) {
        this.onDate = onDate;
    }
}
