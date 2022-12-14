package src;

public class Reception {
    public Reception() {}
    public void matchRequest(Request request) {
        System.out.println("[Reception] Received request to be matched");
    }
    public void acceptRequest(Responder responder, Request request) {}
    public void declineRequest(Responder responder, Request request) {}
}