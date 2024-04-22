package DAO;

import java.util.Date;

public class Comment {
    // Attributes
    private int commentId;
    private int routeId;
    private String content;
    private int likesCount;
    private String location;
    private Date timestamp;

    // Constructor
    public Comment(int commentId, int routeId, String content, int likesCount, String location, Date timestamp) {
        this.commentId = commentId;
        this.routeId = routeId;
        this.content = content;
        this.likesCount = likesCount;
        this.location = location;
        this.timestamp = timestamp;
    }

    // Getter and setter methods for each attribute
    public int getCommentId() {
        return commentId;
    }

    public void setCommentId(int commentId) {
        this.commentId = commentId;
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

