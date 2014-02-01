package com.andrewkravets.utils;

import com.andrewkravets.model.Entry;

import java.io.*;
import java.util.HashMap;

/**
 * User: andrey.kravets
 * Date: 1/31/14 6:42 PM
 */
public class DiskUtil {

    private static final String SAVE_PATH = "data.dat";

    public static void save(Serializable serializable) {
        ObjectOutputStream stream = null;
        try {
            stream = new ObjectOutputStream(new FileOutputStream(getBaseFile()));
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

    public static HashMap<String, Entry> loadData() {
        ObjectInputStream objectInputStream = null;
        HashMap<String, Entry> base = new HashMap<>();
        try {
            File file = getBaseFile();
            if (file.length() > 0) {
                objectInputStream = new ObjectInputStream(new FileInputStream(file));
                base = (HashMap<String, Entry>) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (objectInputStream != null)
                try {
                    objectInputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
        }
        return base;
    }

    private static File getBaseFile() {
        File data = new File(SAVE_PATH);
        if (!data.exists())
            try {
                data.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        return data;
    }


}
