package com.uob;

import java.security.MessageDigest;

public class Sample {

    public void buggyMethod() {
        String str = null;
        System.out.println(str.length()); // BUG: Null pointer dereference
    }

    public void vulnerableMethod() throws Exception {
        // VULNERABILITY: Hardcoded password
        String password = "12345";  
        System.out.println("Using password: " + password);

        // VULNERABILITY: Weak hashing (MD5)
        MessageDigest md = MessageDigest.getInstance("MD5");
        md.update("test".getBytes());
        byte[] digest = md.digest();
        System.out.println(digest);
    }
}
