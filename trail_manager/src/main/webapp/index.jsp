<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Test Servlets</title>
</head>
<body>
    <h1>Test GetRoutesServlet</h1>
    <form action="getRoutes" method="get">
        <input type="submit" value="Get Routes">
    </form>

    <h1>Test GetRoutesByAverageRatingServlet</h1>
    <form action="getRoutesByAverageRating" method="get">
        <label for="averageRating">Average Rating:</label>
        <input type="number" id="averageRating" name="averageRating" step="0.1" min="0" max="5">
        <input type="submit" value="Get Routes By Average Rating">
    </form>

    <h1>Test GetRoutesByDistanceServlet</h1>
    <form action="getRoutesByDistance" method="get">
        <label for="distance">Distance:</label>
        <input type="number" id="distance" name="distance" step="0.1" min="0">
        <input type="submit" value="Get Routes By Distance">
    </form>
</body>
</html>
