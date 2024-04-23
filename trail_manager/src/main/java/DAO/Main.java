package DAO;

public class Main {
    // Main method
    public static void main(String[] args) {
        // Create a new instance of Route
        Route route = new Route("1", null, 0, "easy", "terrain", "description", null, 8);
        // Create a new instance of RouteRating
        RouteRating routeRating = new RouteRating(1, 1, 5, "Great route!");
        // Create a new instance of PointOfInterest
        PointOfInterest pointOfInterest = new PointOfInterest("POI", null, "description");
        // Create a new instance of Photo
        Photo photo = new Photo(1, 1, 1, "imgUrl", "location", null); 
        // Create a new instance of comment
        // Print the route id
        System.out.println("Route ID: " + route.getId());
        // Print the route rating id
        System.out.println("Route Rating ID: " + routeRating.getRatingId());
    }
}
