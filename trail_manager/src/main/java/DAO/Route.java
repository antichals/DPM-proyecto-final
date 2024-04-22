package DAO;

import java.util.List;

public class Route {
    // Attributes
    private String id;
    private List<LatLng> coordinates;
    private double length;
    private String difficulty;
    private String terrainType;
    private String description;
    private List<PointOfInterest> pointsOfInterest;
    private double estimatedDurationInHours;

    // Constructor
    public Route(String id, List<LatLng> coordinates, double length, String difficulty, String terrainType, String description, List<PointOfInterest> pointsOfInterest, double estimatedDurationInHours) {
        this.id = id;
        this.coordinates = coordinates;
        this.length = length;
        this.difficulty = difficulty;
        this.terrainType = terrainType;
        this.description = description;
        this.pointsOfInterest = pointsOfInterest;
        this.estimatedDurationInHours = estimatedDurationInHours;
    }

    // Getter and setter methods for each attribute
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<LatLng> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<LatLng> coordinates) {
        this.coordinates = coordinates;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public String getTerrainType() {
        return terrainType;
    }

    public void setTerrainType(String terrainType) {
        this.terrainType = terrainType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<PointOfInterest> getPointsOfInterest() {
        return pointsOfInterest;
    }

    public void setPointsOfInterest(List<PointOfInterest> pointsOfInterest) {
        this.pointsOfInterest = pointsOfInterest;
    }

    public double getEstimatedDurationInHours() {
        return estimatedDurationInHours;
    }

    public void setEstimatedDurationInHours(double estimatedDurationInHours) {
        this.estimatedDurationInHours = estimatedDurationInHours;
    }
}
