package org.launchcode.spaday.models;

import java.util.Date;

public class User {
    private int userId;
    private static int nextId = 0;
    private String username;
    private String email;
    private String password;
    private Date userJoined = new Date();

    public User(){
        this.userId = nextId;
        nextId++;
    }

    public User(String username, String email, Date userJoined){
        this();
        this.username = username;
        this.email = email;
        this.userJoined = userJoined;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getUserId() {
        return userId;
    }

    public Date getUserJoined() {
        return userJoined;
    }
}
