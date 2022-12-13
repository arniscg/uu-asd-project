package src;

public class Request {
    Requester requester;
    Responder responder;
    TimeRange time;
    PetType petTypes[];
    Location location;
    String description;

    public Request(Requester requester, TimeRange time, PetType petTypes[], Location location, String description) {}
    // Setters
    public void setResponder(Responder responder) {};
    // Getters
    public Requester getRequester() { return this.requester; }
    public Responder getResponder() { return this.responder; }
    public TimeRange getTime() { return this.time; }
    public PetType[] getPets() { return this.petTypes; }
    public Location getLocation() { return this.location; }
    public String getDescription() { return this.description; }
}