package com.andrewkravets.base;

import com.andrewkravets.model.Entry;
import com.andrewkravets.utils.DiskUtil;

import java.util.HashMap;

/**
 * User: andrey.kravets
 * Date: 1/31/14 6:39 PM
 */
public class PhoneBase {
    private HashMap<String, Entry> entries;

    public PhoneBase(){
        entries = DiskUtil.loadData();
    }

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

    public void commit(){
        DiskUtil.save(entries);
    }

}
