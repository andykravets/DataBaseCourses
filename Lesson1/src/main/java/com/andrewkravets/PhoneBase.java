package com.andrewkravets;

import com.andrewkravets.model.Entry;

import java.util.HashMap;
import java.util.Map;

/**
 * User: andrey.kravets
 * Date: 1/31/14 6:39 PM
 */
public class PhoneBase {
    private Map<String, Entry> entries = new HashMap<String, Entry>();

    public void add(String key, Entry entry){
        throw new UnsupportedOperationException();
    }

    public Entry get(String key){
        throw new UnsupportedOperationException();
    }

    public void edit(String key, Entry entry) {
        throw new UnsupportedOperationException();
    }

    public void delete(String key){
        throw new UnsupportedOperationException();
    }

}
