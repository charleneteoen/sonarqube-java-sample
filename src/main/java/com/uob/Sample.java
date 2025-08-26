package com.uob;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Sample {

    public void buggyMethod() {
        String str = null;
        System.out.println(str.length()); // BUG: Null pointer dereference
    }

    public void vulnerableMethod() {
        String userInput = "1 OR 1=1"; // simulate untrusted input
        try {
            Connection conn = DriverManager.getConnection("jdbc:h2:mem:test");
            Statement stmt = conn.createStatement();
            stmt.execute("SELECT * FROM users WHERE id=" + userInput); 
            // VULNERABILITY: SQL Injection
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
