package DAO;

import java.util.List;

public class Route {
    // Attributes
    private int id;
    private List<LatitudeLongitude> coordinates;
    private List<Photo> photos;
    private List<Comment> comments;
    private List<Rating> ratings;
    private String name;
    private double length;
    private String difficulty;
    private String terrainType;
    private String description;
    private double estimatedDurationInHours;

    // Constructor
    public Route(int id, List<LatitudeLongitude> coordinates, List<Photo> photos, List<Comment> comments, List<Rating> ratings, String name, double length, String difficulty, String terrainType, String description, double estimatedDurationInHours) {
        this.id = id;
        this.coordinates = coordinates;
        this.photos = photos;
        this.comments = comments;
        this.ratings = ratings;
        this.name = name;
        this.length = length;
        this.difficulty = difficulty;
        this.terrainType = terrainType;
        this.description = description;
        this.estimatedDurationInHours = estimatedDurationInHours;
    }

    // Getter and setter methods for each attribute
    public int getId() {
        return id;
    }

    public List<LatitudeLongitude> getCoordinates() {
        return coordinates;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Rating> getRatings() {
        return ratings;
    }

    public String getName() {
        return name;
    }

    public double getLength() {
        return length;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public String getDescription() {
        return description;
    }

    public double getEstimatedDurationInHours() {
        return estimatedDurationInHours;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCoordinates(List<LatitudeLongitude> coordinates) {
        this.coordinates = coordinates;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setRatings(List<Rating> ratings) {
        this.ratings = ratings;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setEstimatedDurationInHours(double estimatedDurationInHours) {
        this.estimatedDurationInHours = estimatedDurationInHours;
    }

    // Addition methods
    public void addCoordinate(LatitudeLongitude coordinate) {
        this.coordinates.add(coordinate);
    }

    public void addPhoto(Photo photo) {
        this.photos.add(photo);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    public void addRating(Rating rating) {
        this.ratings.add(rating);
    }

    // Deletion methods
    public void deleteCoordinate(LatitudeLongitude coordinate) {
        this.coordinates.remove(coordinate);
    }

    public void deletePhoto(Photo photo) {
        this.photos.remove(photo);
    }

    public void deleteComment(Comment comment) {
        this.comments.remove(comment);
    }

    public void deleteRating(Rating rating) {
        this.ratings.remove(rating);
    }
}
