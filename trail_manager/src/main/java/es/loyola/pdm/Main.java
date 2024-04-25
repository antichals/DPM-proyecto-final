package es.loyola.pdm;

import es.loyola.pdm.DAO.Comment;
import es.loyola.pdm.DAO.Route;
import es.loyola.pdm.DAO.LatitudeLongitude;
import es.loyola.pdm.DAO.Photo;
import es.loyola.pdm.DAO.Rating;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a new Route object
        Route route = new Route(1, null, null, null, null, "Route 1", 10.5, "Easy", "Forest", "A nice route through the forest", 2.5);

        // Create a new LatitudeLongitude object list
        List<LatitudeLongitude> latLongs = new ArrayList<LatitudeLongitude>();
        // Add some LatitudeLongitude objects to the list
        latLongs.add(new LatitudeLongitude(51.5074, 0.1278));
        latLongs.add(new LatitudeLongitude(48.8566, 2.3522));
        latLongs.add(new LatitudeLongitude(40.7128, -74.0060));

        // Set the route's coordinates
        route.setCoordinates(latLongs);

        // Create a new Photo object list
        List<Photo> photos = new ArrayList<Photo>();
        // Add some Photo objects to the list
        photos.add(new Photo("user1", "img1.jpg", "London", null));
        photos.add(new Photo("user2", "img2.jpg", "Paris", null));
        photos.add(new Photo("user3", "img3.jpg", "New York", null));
    
        // Set the route's photos
        route.setPhotos(photos);

        // Create a new Comment object list
        List<Comment> comments = new ArrayList<Comment>();
        // Add some Comment objects to the list
        comments.add(new Comment("user1", "Great route!", "London", null));
        comments.add(new Comment("user2", "Nice route!", "Paris", null));
        comments.add(new Comment("user3", "Good route!", "New York", null));

        // Set the route's comments
        route.setComments(comments);

        // Create a new Rating object list
        List<Rating> ratings = new ArrayList<Rating>();
        // Add some Rating objects to the list
        ratings.add(new Rating("user1", 5));
        ratings.add(new Rating("user2", 4));
        ratings.add(new Rating("user3", 3));

        // Set the route's ratings
        route.setRatings(ratings);

        // Print the route's details
        route.printRoute();
    }
}
