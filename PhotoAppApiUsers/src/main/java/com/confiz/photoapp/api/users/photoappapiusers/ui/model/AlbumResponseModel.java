package com.confiz.photoapp.api.users.photoappapiusers.ui.model;

public class AlbumResponseModel {
    private String albumId;
    private String userId;
    private String name;
    private String description;

    public String getAlbumId() {
        return albumId;
    }

    public AlbumResponseModel setAlbumId(String albumId) {
        this.albumId = albumId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public AlbumResponseModel setUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getName() {
        return name;
    }

    public AlbumResponseModel setName(String name) {
        this.name = name;
        return this;
    }

    public String getDescription() {
        return description;
    }

    public AlbumResponseModel setDescription(String description) {
        this.description = description;
        return this;
    }
}
