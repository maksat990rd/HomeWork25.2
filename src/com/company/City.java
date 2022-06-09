package com.company;

import java.util.Comparator;

public class City implements Comparable<City> {
    private int code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public City() {
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "City code: " + this.getCode() + ", name: " + this.getName();
    }


    @Override
    public int compareTo(City code) {
        if (this.code == code.getCode()) {
            return 0;
        } else if (this.code > code.getCode()) {
            return -1;
        } else
            return 1;
    }
}
