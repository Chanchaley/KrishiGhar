package com.krishighar.model;

import java.util.List;

/**
 * Created by NaRan on 11/17/17 at 08:43.
 */

public class WeatherModel {

    private String status;

    private String place;

    private String max;

    private String min;

    private String rain;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getMax() {
        return max;
    }

    public void setMax(String max) {
        this.max = max;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getRain() {
        return rain;
    }

    public void setRain(String rain) {
        this.rain = rain;
    }


}
