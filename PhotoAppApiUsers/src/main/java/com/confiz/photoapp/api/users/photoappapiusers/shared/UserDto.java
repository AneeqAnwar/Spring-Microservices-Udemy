package com.confiz.photoapp.api.users.photoappapiusers.shared;

import com.confiz.photoapp.api.users.photoappapiusers.ui.model.AlbumResponseModel;

import java.io.Serializable;
import java.util.List;

public class UserDto implements Serializable {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String userId;
    private String encryptedPassword;
    private List<AlbumResponseModel> albums;

    public String getFirstName() {
        return firstName;
    }

    public UserDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public UserDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserDto setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserDto setPassword(String password) {
        this.password = password;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public UserDto setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public UserDto setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
        return this;
    }

    public List<AlbumResponseModel> getAlbums() {
        return albums;
    }

    public UserDto setAlbums(List<AlbumResponseModel> albums) {
        this.albums = albums;
        return this;
    }
}
