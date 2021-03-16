package com.confiz.photoapp.api.users.photoappapiusers.ui.model;

public class LoginRequestModel {

    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public LoginRequestModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginRequestModel setPassword(String password) {
        this.password = password;
        return this;
    }
}
