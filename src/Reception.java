package src;

public class Reception {
    MatcherManager matcherManager;

    public Reception(MatcherManager matcherManager) {
        this.matcherManager = matcherManager;
    }

    public void matchRequest(Request request) {
        System.out.println("[Reception] matchRequest() called");

        matcherManager.newMatcher(request);
    }

    public void acceptRequest(Responder responder, Request request) {}
    public void declineRequest(Responder responder, Request request) {}
}