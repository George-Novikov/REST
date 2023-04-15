package com.valtime.rest.entities;

import com.valtime.rest.tools.AccessLevel;

public class User {
    private String username;
    private String password;
    private AccessLevel accessLevel;

    public User(){}
    public User(String username, String password, AccessLevel accessLevel){
        this.username = username;
        this.password = password;
        this.accessLevel = accessLevel;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AccessLevel getAccessLevel() {
        return accessLevel;
    }

    public void setAccessLevel(AccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }
}
