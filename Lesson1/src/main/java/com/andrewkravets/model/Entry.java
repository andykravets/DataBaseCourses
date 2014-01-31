package com.andrewkravets.model;

import java.io.Serializable;

/**
 * User: andrey.kravets
 * Date: 1/31/14 6:40 PM
 */
public class Entry implements Serializable {
    private String name;
    private String number;

    public Entry(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
