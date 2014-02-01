package com.andrewkravets;

import com.andrewkravets.base.PhoneBase;

import java.util.Scanner;

/**
 * Created by akravets on 1/31/14.
 */
public class MainInt {
    public static void main(String[] args) {
        PhoneBase database = new PhoneBase();

        Scanner scanner = new Scanner(System.in);
        String input=null;
        while((input=scanner.nextLine())!=null){
            System.out.println(input);
        }

    }
}
