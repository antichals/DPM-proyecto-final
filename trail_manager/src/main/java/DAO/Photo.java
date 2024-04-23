package DAO;

import java.util.Date;

public class Photo {
    // Attributes
    private int photoId;
    private int routeId;
    private int userId;
    private String imgUrl;
    private String location;
    private Date timestamp;

    // Constructor
    public Photo(int photoId, int routeId, int userId, String imgUrl, String location, Date timestamp) {
        this.photoId = photoId;
        this.routeId = routeId;
        this.userId = userId;
        this.imgUrl = imgUrl;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
    
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String projectPath) {
        this.imgUrl = projectPath;
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


