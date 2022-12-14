package src;

public class Location {
    String address;
    double coordinates[];

    public Location(String address, double coordinates[]) {}
    public boolean isInRadius(Location location, int radius) { return true; }
}