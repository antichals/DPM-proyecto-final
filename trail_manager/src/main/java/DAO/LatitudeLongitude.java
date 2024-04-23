package DAO;

// LatitudeLongitude class for representing coordinates
public class LatitudeLongitude {
    // Attributes
    private double latitude;
    private double longitude;

    // Constructor
    public LatitudeLongitude(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getter and setter methods for each attribute
    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
