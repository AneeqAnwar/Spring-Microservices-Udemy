package com.confiz.photoapp.api.users.photoappapiusers.ui.model;

import java.util.List;

public class UserResponseModel {

    private String userId;
    private String firstName;
    private String lastName;
    private String email;
    private List<AlbumResponseModel> albums;

    public String getUserId() {
        return userId;
    }

    public UserResponseModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public UserResponseModel setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserResponseModel setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserResponseModel setEmail(String email) {
        this.email = email;
        return this;
    }

    public List<AlbumResponseModel> getAlbums() {
        return albums;
    }

    public UserResponseModel setAlbums(List<AlbumResponseModel> albums) {
        this.albums = albums;
        return this;
    }
}
