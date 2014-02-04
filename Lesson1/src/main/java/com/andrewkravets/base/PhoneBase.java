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

    public PhoneBase() {
        entries = DiskUtil.loadData();
    }

    public void add(String key, Entry entry) {
        entries.put(key, entry);
    }

    public Entry get(String key) {
        return entries.get(key);
    }

    public void edit(String key, Entry entry) {
        add(key, entry);
    }

    public void delete(String key) {
        entries.remove(key);
    }

    public void commit() {
        DiskUtil.save(entries);
    }

}
