package DAO;
import java.util.List;

// Point of Interest class to reprensent interesting locations
public class PointOfInterest {
    // Attributes
    private String name;
    private LatitudLongitud location;
    private List<Photo> photos;
    private List<Comment> comments;

    // Constructor
    public PointOfInterest(String name, LatitudLongitud location, String description) {
        this.name = name;
        this.location = location;
    }

    // Getter and setter methods for each attribute
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LatitudLongitud getLocation() {
        return location;
    }

    public void setLocation(LatitudLongitud location) {
        this.location = location;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }
}
