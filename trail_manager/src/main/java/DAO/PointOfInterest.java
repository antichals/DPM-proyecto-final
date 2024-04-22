package DAO;

public class PointOfInterest {
    // Attributes
    private String name;
    private LatLng location;
    private String description;

    // Constructor
    public PointOfInterest(String name, LatLng location, String description) {
        this.name = name;
        this.location = location;
        this.description = description;
    }

    // Getter and setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LatLng getLocation() {
        return location;
    }

    public void setLocation(LatLng location) {
        this.location = location;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

