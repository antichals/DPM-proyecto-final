package DAO;

// LatLng class for representing coordinates
public class LatLng {
    // Attributes
    private double latitude;
    private double longitude;

    // Constructor
    public LatLng(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    // Getter and setter methods for each attribute
    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
}
