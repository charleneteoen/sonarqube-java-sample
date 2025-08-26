package com.uob;

import java.io.File;

public class Sample {

    public void buggyMethod() {
        String str = null;
        System.out.println(str.length()); // BUG: Null pointer dereference
    }

    public void vulnerableMethod(String userInput) {
        // VULNERABILITY: Using user input directly in file path
        File file = new File("/tmp/" + userInput);
        System.out.println("File exists? " + file.exists());
    }
}
