package src;

import java.time.LocalDateTime;
import java.util.List;

public class Request {
    Requester requester;
    Responder responder;
    TimeRange time;
    List<PetType> petTypes;
    Location location;
    String description;

    public Request(Requester requester,
        LocalDateTime startTime, LocalDateTime endTime, List<PetType> petTypes,
        String address, double[] coordinates, String description) {

        time = new TimeRange(startTime, endTime);
        location = new Location(address, coordinates);

        System.out.println("    [Request] Created");
    }
    // Setters
    public void setResponder(Responder responder) {};
    // Getters
    public Requester getRequester() { return this.requester; }
    public Responder getResponder() { return this.responder; }
    public TimeRange getTime() { return this.time; }
    public List<PetType> getPets() { return this.petTypes; }
    public Location getLocation() { return this.location; }
    public String getDescription() { return this.description; }
}