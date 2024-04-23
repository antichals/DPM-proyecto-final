package DAO;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TestDAOs {

    @Test
    public void testCommentGettersAndSetters() {
        // Arrange
        Comment comment = new Comment("user", "content", "location", new Date());

        // Act
        comment.setUsername("newUser");
        comment.setContent("newContent");
        comment.setLocation("newLocation");
        comment.setTimestamp(new Date(123456789)); // Setting a fixed timestamp for testing

        // Assert
        assertEquals("newUser", comment.getUsername());
        assertEquals("newContent", comment.getContent());
        assertEquals("newLocation", comment.getLocation());
        assertEquals(new Date(123456789), comment.getTimestamp());
    }

    @Test
    public void testLatitudeLongitudeGettersAndSetters() {
        // Arrange
        LatitudeLongitude coordinates = new LatitudeLongitude(37.7749, -122.4194);

        // Act
        coordinates.setLatitude(40.7128);
        coordinates.setLongitude(-74.0060);

        // Assert
        assertEquals(40.7128, coordinates.getLatitude(), 0.0001);
        assertEquals(-74.0060, coordinates.getLongitude(), 0.0001);
    }
    
    @Test
    public void testPhotoGettersAndSetters() {
        // Arrange
        Date timestamp = new Date();
        Photo photo = new Photo("user", "imgUrl", "location", timestamp);

        // Act
        photo.setUsername("newUser");
        photo.setImgUrl("newImgUrl");
        photo.setLocation("newLocation");
        photo.setTimestamp(new Date(123456789)); // Setting a fixed timestamp for testing

        // Assert
        assertEquals("newUser", photo.getUsername());
        assertEquals("newImgUrl", photo.getImgUrl());
        assertEquals("newLocation", photo.getLocation());
        assertEquals(new Date(123456789), photo.getTimestamp());
    }

    @Test
    public void testRatingGettersAndSetters() {
        // Arrange
        Rating rating = new Rating("user", 5);

        // Act
        rating.setUsername("newUser");
        rating.setRating(4);

        // Assert
        assertEquals("newUser", rating.getUsername());
        assertEquals(4, rating.getRating());
    }
    
    @Test
    public void testRouteGettersAndSetters() {
        // Arrange
        List<LatitudeLongitude> coordinates = new ArrayList<>();
        coordinates.add(new LatitudeLongitude(37.7749, -122.4194));
        List<Photo> photos = new ArrayList<>();
        photos.add(new Photo("user", "imgUrl", "location", new Date()));
        List<Comment> comments = new ArrayList<>();
        comments.add(new Comment("user", "content", "location", new Date()));
        List<Rating> ratings = new ArrayList<>();
        ratings.add(new Rating("user", 5));
        String name = "Route Name";
        double length = 10.5;
        String difficulty = "Easy";
        String terrainType = "Forest";
        String description = "Route Description";
        double estimatedDurationInHours = 2.5;

        Route route = new Route(1, coordinates, photos, comments, ratings, name, length, difficulty, terrainType, description, estimatedDurationInHours);

        // Act
        route.setId(2);
        List<LatitudeLongitude> newCoordinates = new ArrayList<>();
        newCoordinates.add(new LatitudeLongitude(40.7128, -74.0060));
        route.setCoordinates(newCoordinates);
        List<Photo> newPhotos = new ArrayList<>();
        newPhotos.add(new Photo("newUser", "newImgUrl", "newLocation", new Date(123456789)));
        route.setPhotos(newPhotos);
        List<Comment> newComments = new ArrayList<>();
        newComments.add(new Comment("newUser", "newContent", "newLocation", new Date(123456789)));
        route.setComments(newComments);
        List<Rating> newRatings = new ArrayList<>();
        newRatings.add(new Rating("newUser", 4));
        route.setRatings(newRatings);
        route.setName("New Route Name");
        route.setLength(15.75);
        route.setDifficulty("Moderate");
        route.setTerrainType("Mountain");
        route.setDescription("New Route Description");
        route.setEstimatedDurationInHours(3.5);

        // Assert
        assertEquals(2, route.getId());
        assertEquals(newCoordinates, route.getCoordinates());
        assertEquals(newPhotos, route.getPhotos());
        assertEquals(newComments, route.getComments());
        assertEquals(newRatings, route.getRatings());
        assertEquals("New Route Name", route.getName());
        assertEquals(15.75, route.getLength(), 0.0001);
        assertEquals("Moderate", route.getDifficulty());
        assertEquals("Mountain", route.getTerrainType());
        assertEquals("New Route Description", route.getDescription());
        assertEquals(3.5, route.getEstimatedDurationInHours(), 0.0001);
    }
    
    @Test
    public void testUserGettersAndSetters() {
        // Arrange
        User user = new User("username", "password", "email@example.com", "Full Name");

        // Act
        user.setUsername("newUsername");
        user.setPassword("newPassword");
        user.setEmail("newemail@example.com");
        user.setName("New Full Name");

        // Assert
        assertEquals("newUsername", user.getUsername());
        assertEquals("newPassword", user.getPassword());
        assertEquals("newemail@example.com", user.getEmail());
        assertEquals("New Full Name", user.getName());
    }
}
