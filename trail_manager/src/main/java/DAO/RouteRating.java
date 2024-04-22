package DAO;

public class RouteRating {
    // Attributes
    private int ratingId;
    private int routeId;
    private int score;
    private String comment;

    // Constructor
    public RouteRating(int ratingId, int routeId, int score, String comment) {
        this.ratingId = ratingId;
        this.routeId = routeId;
        this.score = score;
        this.comment = comment;
    }

    // Getter and setter methods for each attribute
    public int getRatingId() {
        return ratingId;
    }

    public void setRatingId(int ratingId) {
        this.ratingId = ratingId;
    }

    public int getRouteId() {
        return routeId;
    }

    public void setRouteId(int routeId) {
        this.routeId = routeId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

