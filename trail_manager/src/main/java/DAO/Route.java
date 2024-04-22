package DAO;
import java.util.List;

public interface Route {
    String getId();
    void setId(String id);

    List<String> getCoordinates();
    void setCoordinates(List<String> coordinates);

    String getStartLocation();
    void setStartLocation(String startLocation);

    String getEndLocation();
    void setEndLocation(String endLocation);

    double getLength();
    void setLength(double length);

    String getDifficulty();
    void setDifficulty(String difficulty);

    String getTerrainType();
    void setTerrainType(String terrainType);

    String getDescription();
    void setDescription(String description);

    List<String> getPointsOfInterest();
    void setPointsOfInterest(List<String> pointsOfInterest);

    double getEstimatedDurationInHours();
    void setEstimatedDurationInHours(double estimatedDurationInHours);
}
