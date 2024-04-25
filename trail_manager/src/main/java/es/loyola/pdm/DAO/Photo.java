package es.loyola.pdm.DAO;

import java.util.Date;

public class Photo {
    // Attributes
    private String username;
    private String imgUrl;
    private String location;
    private Date timestamp;

    // Constructor
    public Photo(String username, String imgUrl, String location, Date timestamp) {
        this.username = username;
        this.imgUrl = imgUrl;
        this.location = location;
        this.timestamp = timestamp;
    }

    // Getter and setter methods for each attribute
    public String getUsername() {
        return username;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getLocation() {
        return location;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
