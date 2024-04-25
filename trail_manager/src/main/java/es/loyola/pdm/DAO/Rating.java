package es.loyola.pdm.DAO;

public class Rating {
    // Attributes
    private String username;
    private int rating;

    // Constructor
    public Rating(String username, int rating) {
        this.username = username;
        this.rating = rating;
    }

    // Getter and setter methods for each attribute
    public String getUsername() {
        return username;
    }

    public int getRating() {
        return rating;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
