package com.uob;

import java.io.File;

public class HelloBank {
    public static void main(String[] args) {
        // BUG: Null pointer dereference (optional, only if you want a bug)
        String str = null;
        // System.out.println(str.length()); // uncomment if you also want a bug

        // VULNERABILITY: User-controlled input used directly in file path
        if (args.length > 0) {
            String userInput = args[0]; // simulate untrusted input
            File file = new File("/tmp/" + userInput);
            System.out.println("File exists? " + file.exists());
        }

        System.out.println("Welcome to UOB!");
        System.out.println("Welcome to UOBx!");
    }
}
