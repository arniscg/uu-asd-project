package src;

public class Location {
    String address;
    double coordinates[];

    public Location(String address, double coordinates[]) {
        System.out.println("[Location] Created");
    }
    public boolean isInRadius(Location location, int radius) { return true; }
}