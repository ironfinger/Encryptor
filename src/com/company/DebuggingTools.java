package com.company;

public class DebuggingTools {
    DebuggingTools () {

    }

    public void displayArrayInt(int[] array) {
        System.out.println("Array");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.print(array[i]);
        }
    }

    public void displayArrayString(String [] array) {
        System.out.println("Array");
        for (int i = 0; i <= array.length - 1; i++) {
            System.out.println(array[i]);
        }
    }
}
