package es.loyola.pdm.services;
import es.loyola.pdm.manager.RouteManager;
import es.loyola.pdm.DAO.LatitudeLongitude;
import es.loyola.pdm.DAO.Photo;
import es.loyola.pdm.DAO.Rating;
import es.loyola.pdm.DAO.Route;
import es.loyola.pdm.DAO.Comment;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/getRoutes")
public class GetRoutesServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RouteManager routeManager = new RouteManager();
        JSONArray routesJsonArray = new JSONArray();
        
        for (Route route : routeManager.getRoutes()) {
            JSONObject routeJson = new JSONObject();
            routeJson.put("id", route.getId());
            routeJson.put("name", route.getName());
            routeJson.put("length", route.getLength());
            routeJson.put("difficulty", route.getDifficulty());
            routeJson.put("terrainType", route.getTerrainType());
            routeJson.put("description", route.getDescription());
            routeJson.put("estimatedDurationInHours", route.getEstimatedDurationInHours());
            
            JSONArray coordinatesJsonArray = new JSONArray();
            for (LatitudeLongitude coordinate : route.getCoordinates()) {
                JSONObject coordinateJson = new JSONObject();
                coordinateJson.put("latitude", coordinate.getLatitude());
                coordinateJson.put("longitude", coordinate.getLongitude());
                coordinatesJsonArray.put(coordinateJson);
            }
            routeJson.put("coordinates", coordinatesJsonArray);
            
            JSONArray photosJsonArray = new JSONArray();
            for (Photo photo : route.getPhotos()) {
                JSONObject photoJson = new JSONObject();
                photoJson.put("username", photo.getUsername());
                photoJson.put("imgUrl", photo.getImgUrl());
                photoJson.put("location", photo.getLocation());
                photoJson.put("timestamp", photo.getTimestamp().getTime());
                photosJsonArray.put(photoJson);
            }
            routeJson.put("photos", photosJsonArray);
            
            JSONArray commentsJsonArray = new JSONArray();
            for (Comment comment : route.getComments()) {
                JSONObject commentJson = new JSONObject();
                commentJson.put("username", comment.getUsername());
                commentJson.put("content", comment.getContent());
                commentJson.put("location", comment.getLocation());
                commentJson.put("timestamp", comment.getTimestamp().getTime());
                commentsJsonArray.put(commentJson);
            }
            routeJson.put("comments", commentsJsonArray);
            
            JSONArray ratingsJsonArray = new JSONArray();
            for (Rating rating : route.getRatings()) {
                JSONObject ratingJson = new JSONObject();
                ratingJson.put("username", rating.getUsername());
                ratingJson.put("rating", rating.getRating());
                ratingsJsonArray.put(ratingJson);
            }
            routeJson.put("ratings", ratingsJsonArray);
            
            routesJsonArray.put(routeJson);
        }
        
        response.setContentType("application/json");
        response.setCharacterEncoding("UTF-8");
        response.getWriter().write(routesJsonArray.toString());
    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
