package com.confiz.photoapp.api.users.photoappapiusers.ui.model;

public class CreateUserResponseModel {

    private String firstName;
    private String lastName;
    private String email;
    private String userId;

    public String getFirstName() {
        return firstName;
    }

    public CreateUserResponseModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public CreateUserResponseModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public CreateUserResponseModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public CreateUserResponseModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }
}
