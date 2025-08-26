package com.uob;

import java.io.File;

public class HelloBank {
    public static void main(String[] args) {
        // BUG: Hardcoded password (security risk)
        String password = "abc"; 
        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");

        // VULNERABILITY: Using user input directly in file path
        String userInput = "userdata.txt"; // simulate untrusted input
        File file = new File("/tmp/" + userInput);
        System.out.println("File exists? " + file.exists());
    }
}
