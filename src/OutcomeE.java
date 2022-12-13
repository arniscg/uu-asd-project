package src;
import java.time.LocalDateTime;

import src.Reception;
import src.Preferences;
import src.Request;
import src.MatcherManager;

// Main
public class OutcomeE {
    public static void main(String[] args) {
        System.out.println("Hello world");
    }
}

enum PetType {
    Dog,
    Cat,
    Snake,
    Other
}

class Location {
    String address;
    double coordinates[];

    public Location(String address, double coordinates[]) {}
    public boolean isInRadius(Location location, int radius) { return true; }
}

// User component
abstract class User {
    String name;
    String phoneNumber;
    String email;

    public String getName() { return this.name; }
    public String getPhoneNumber() { return this.phoneNumber; }
    public String getEmail() { return this.email; }
}

class Requester extends User {
    public Requester(String name, String phoneNumber, String email) {}
}

class Responder extends User {
    Preferences preferences;
    Location location;

    public Responder(String name, String phoneNumber, String email) {}

    public void setPreferences() {}
    public void setLocation() {}
    public Preferences getPreferences() { return preferences; }
    public Location getLocation() { return location; }
}

class TimeRange {
    LocalDateTime startTime;
    LocalDateTime endTime;

    public TimeRange(LocalDateTime startTime, LocalDateTime endTime) {}

    boolean isInRange(TimeRange range) { return true; }
}

class Feedback {}