package es.loyola.pdm.DAO;

import java.util.Date;

public class Comment {
    // Attributes
    private String username;
    private String content;
    private String location;
    private Date timestamp;

    // Constructor
    public Comment(String username, String content, String location, Date timestamp) {
        this.username = username;
        this.content = content;
        this.location = location;
        this.timestamp = timestamp;
    }

    // Getter and setter methods for each attribute
    public String getUsername() {
        return username;
    }

    public String getContent() {
        return content;
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

    public void setContent(String content) {
        this.content = content;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }
}
