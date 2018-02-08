package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here

        // Create new Encryptor object.
        Encryptor encryptor = new Encryptor(); // Creates a new encryptor object.

        boolean progamActive = true;

        while (progamActive == true) {
            displayMenu(); // Displays the menu.
            int input = getMenuInput(); // Gets input from the user.

            // Decides which menu option the user chose.
            if (input == 1) {
                encryptor.addNewPassword(); // Adds a new password to the passwords array.
            }else if (input == 2) {

            }else if (input == 3) {

            }
        }
    }

    public static void displayMenu() {
        System.out.println("Welcome to the encryption program");
        System.out.println("1. Encrypt new password");
        System.out.println("2. Retrieve password");
        System.out.println("Exit program");
    }

    static int getMenuInput() {
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }
}
