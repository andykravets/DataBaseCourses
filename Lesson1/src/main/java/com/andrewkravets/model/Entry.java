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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Entry entry = (Entry) o;

        if (name != null ? !name.equals(entry.name) : entry.name != null) return false;
        if (number != null ? !number.equals(entry.number) : entry.number != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (number != null ? number.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Entry{" +
                "name='" + name + '\'' +
                ", number='" + number + '\'' +
                '}';
    }
}
