package com.andrewkravets.utils;

import com.andrewkravets.model.Entry;

import java.io.*;
import java.util.HashMap;

/**
 * User: andrey.kravets
 * Date: 1/31/14 6:42 PM
 */
public class DiskUtil {

    private static final String SAVE_PATH = "";

    public static void save(Serializable serializable) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(SAVE_PATH));
            stream.writeObject(serializable);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (stream != null)
                try {
                    stream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
    }

    public static HashMap<String, Entry> loadData(){
        ObjectInputStream objectInputStream = null;
        HashMap<String, Entry> base= new HashMap<>();
        try{
            objectInputStream = new ObjectInputStream(new FileInputStream(SAVE_PATH));
            base = (HashMap<String, Entry>) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if(objectInputStream!=null)
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return base;
    }


}
