package com.company;

import java.util.Scanner;

public class Encryptor {

    String[] names;
    int [][] passwords;

    String tempPasswordStore; // Temporarily stores this password so we can reference it before it goes in to the encrypted passwords array.
    String tempServiceStore;

    Encryptor () {
        names = new String[0];
        passwords = new int[0][0];
    }

    // Encrypt:
    // 1. Take in user input.
    // 2. Encrypt password.

    public void addNewPassword() {
        System.out.println("Type in service for this password");

        Scanner scn = new Scanner(System.in);
//        String service = scn.next("");

        System.out.println("Type in the password for this service");
//        String password = scn.next("");

        // EXAMPLE CODE NOT FINAL VERSION !!!!!!!!!
        storeValues("Google", "Google");
    }

    private void storeValues(String name, String password) {
        String newName = "Google";

        storeToNames(newName);
    }

    private void storeToNames(String name) {
        int newSize = names.length + 1;

        String[] tempArray = new String[newSize];

        for (int i = 0; i <= tempArray.length - 1; i++) {
            if (i == tempArray.length - 1) {
                tempArray[i] = name;
            }else {
                tempArray[i] = names[i];
            }
        }
        names = tempArray;
    }
}

