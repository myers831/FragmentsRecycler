package com.example.admin.fragmentsrecycler;

/**
 * Created by Admin on 10/5/2017.
 */

public class Car {

    String model, type, year;

    public Car(String model, String type, String year) {
        this.model = model;
        this.type = type;
        this.year = year;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }
}
