package es.loyola.pdm.manager;
import es.loyola.pdm.DAO.LatitudeLongitude;
import es.loyola.pdm.DAO.Photo;
import es.loyola.pdm.DAO.Rating;
import es.loyola.pdm.DAO.Route;
import es.loyola.pdm.DAO.Comment;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Date;

public class RouteManager {
    private static RouteManager instance;
    private List<Route> routes;

    public RouteManager() {
        this.routes = new ArrayList<>();
        generateRoutes();
    }

    public static synchronized RouteManager getInstance() {
        if (instance == null) {
            instance = new RouteManager();
        }
        return instance;
    }

    public List<Route> getRoutes() {
        return routes;
    }

    public void setRoutes(List<Route> routes) {
        this.routes = routes;
    }

    public void generateRoutes() {
        Random random = new Random();
        for (int i = 1; i <= 20; i++) {
            int id = i;
            List<LatitudeLongitude> coordinates = generateCoordinates(random);
            List<Photo> photos = generatePhotos(random);
            List<Comment> comments = generateComments(random);
            List<Rating> ratings = generateRatings(random);
            String name = "Route " + i;
            double length = random.nextDouble() * 50 + 1; // Random length between 1 and 50
            String difficulty = generateDifficulty(random);
            String terrainType = generateTerrainType(random);
            String description = "Description " + i;
            double estimatedDurationInHours = random.nextDouble() * 10 + 1; // Random duration between 1 and 10 hours

            Route route = new Route(id, coordinates, photos, comments, ratings, name, length, difficulty, terrainType, description, estimatedDurationInHours);
            routes.add(route);
        }
    }

    private List<LatitudeLongitude> generateCoordinates(Random random) {
        List<LatitudeLongitude> coordinates = new ArrayList<>();
        for (int i = 0; i < 10; i++) { // Generate 10 random coordinates
            double latitude = random.nextDouble() * 180 - 90; // Random latitude between -90 and 90
            double longitude = random.nextDouble() * 360 - 180; // Random longitude between -180 and 180
            coordinates.add(new LatitudeLongitude(latitude, longitude));
        }
        return coordinates;
    }

    private List<Photo> generatePhotos(Random random) {
        List<Photo> photos = new ArrayList<>();
        for (int i = 0; i < 5; i++) { // Generate 5 random photos
            String username = "User " + (i + 1);
            String imgUrl = "https://example.com/photo" + (i + 1) + ".jpg";
            String location = "Location " + (i + 1);
            Date timestamp = new Date(System.currentTimeMillis() - random.nextInt(10000000)); // Random timestamp within the last few days
            photos.add(new Photo(username, imgUrl, location, timestamp));
        }
        return photos;
    }

    private List<Comment> generateComments(Random random) {
        List<Comment> comments = new ArrayList<>();
        for (int i = 0; i < 3; i++) { // Generate 3 random comments
            String username = "User " + (i + 1);
            String content = "Comment " + (i + 1);
            String location = "Location " + (i + 1);
            Date timestamp = new Date(System.currentTimeMillis() - random.nextInt(10000000)); // Random timestamp within the last few days
            comments.add(new Comment(username, content, location, timestamp));
        }
        return comments;
    }

    private List<Rating> generateRatings(Random random) {
        List<Rating> ratings = new ArrayList<>();
        for (int i = 0; i < 3; i++) { // Generate 3 random ratings
            String username = "User " + (i + 1);
            int rating = random.nextInt(5) + 1; // Random rating between 1 and 5
            ratings.add(new Rating(username, rating));
        }
        return ratings;
    }

    private String generateDifficulty(Random random) {
        String[] difficulties = {"Easy", "Medium", "Hard"};
        return difficulties[random.nextInt(difficulties.length)];
    }

    private String generateTerrainType(Random random) {
        String[] terrainTypes = {"Flat", "Hilly", "Mountainous"};
        return terrainTypes[random.nextInt(terrainTypes.length)];
    }

    public void addRoute(Route route) {
        this.routes.add(route);
    }

    public void removeRoute(Route route) {
        this.routes.remove(route);
    }

    public Route getRouteById(int id) {
        for (Route route : this.routes) {
            if (route.getId() == id) {
                return route;
            }
        }
        return null;
    }

    public List<Route> getRoutesByDifficulty(String difficulty) {
        List<Route> routesByDifficulty = new ArrayList<>();
        for (Route route : this.routes) {
            if (route.getDifficulty().equals(difficulty)) {
                routesByDifficulty.add(route);
            }
        }
        return routesByDifficulty;
    }

    public List<Route> getRoutesByTerrainType(String terrainType) {
        List<Route> routesByTerrainType = new ArrayList<>();
        for (Route route : this.routes) {
            if (route.getTerrainType().equals(terrainType)) {
                routesByTerrainType.add(route);
            }
        }
        return routesByTerrainType;
    }

    public List<Route> getRoutesByLength(double length) {
        List<Route> routesByLength = new ArrayList<>();
        for (Route route : this.routes) {
            if (route.getLength() == length) {
                routesByLength.add(route);
            }
        }
        return routesByLength;
    }

    public List<Route> getRoutesByEstimatedDurationInHours(double estimatedDurationInHours) {
        List<Route> routesByEstimatedDurationInHours = new ArrayList<>();
        for (Route route : this.routes) {
            if (route.getEstimatedDurationInHours() == estimatedDurationInHours) {
                routesByEstimatedDurationInHours.add(route);
            }
        }
        return routesByEstimatedDurationInHours;
    }
}
