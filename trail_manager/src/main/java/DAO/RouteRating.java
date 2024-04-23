package DAO;

public class RouteRating {
    // Attributes
    private int ratingId;
    private int routeId;
    private int userID;
    private int score;

    // Constructor
    public RouteRating(int ratingId, int routeId, int score) {
        this.ratingId = ratingId;
        this.routeId = routeId;
        this.score = score;
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

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
