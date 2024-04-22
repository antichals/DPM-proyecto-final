package DAO;

import java.util.Date;

public class Photo {
    private int photoId;
    private int routeId;
    private String content;
    private int likesCount;
    private String location;
    private Date timestamp;

    // Constructor
    public Photo(int photoId, int routeId, String content, int likesCount, String location, Date timestamp) {
        this.photoId = photoId;
        this.routeId = routeId;
        this.content = content;
        this.likesCount = likesCount;
        this.location = location;
        this.timestamp = timestamp;
    }

    // Getter and setter methods for each attribute
    public int getPhotoId() {
        return photoId;
    }

    public void setPhotoId(int photoId) {
        this.photoId = photoId;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}


