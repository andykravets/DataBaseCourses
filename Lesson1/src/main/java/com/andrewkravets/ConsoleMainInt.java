package com.andrewkravets;

import com.andrewkravets.base.PhoneBase;
import com.andrewkravets.model.Entry;

import java.util.Scanner;

/**
 * Created by akravets on 1/31/14.
 */
public class ConsoleMainInt {
    public static void main(String[] args) {
        PhoneBase database = new PhoneBase();

        Scanner scanner = new Scanner(System.in);
        String input = null;
        while ((input = scanner.nextLine()) != null) {
            //Should be replaced with something better;
            String command = input.substring(0, input.indexOf("("));
            String[] vals = input.substring(input.indexOf("(") + 1, input.indexOf(")")).replaceAll(" ", "").split(",");
            Entry entry;
            switch (command) {
                case "get":
                    System.out.println(database.get(vals[0]));
                    break;
                case "create":
                    entry = new Entry(vals[1], vals[2]);
                    database.add(vals[0], entry);
                    System.out.println(entry);
                    break;
                case "update":
                    entry = new Entry(vals[1], vals[2]);
                    database.edit(vals[0], entry);
                    System.out.println(entry);
                    break;
                case "delete":
                    database.delete(vals[0]);
                    break;
                case "commit":
                    database.commit();
                    break;
            }
        }

    }
}
