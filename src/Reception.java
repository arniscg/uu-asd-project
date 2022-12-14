package src;

public class Reception {
    MatcherManager matcherManager;

    public Reception(MatcherManager matcherManager) {
        this.matcherManager = matcherManager;
    }

    public void matchRequest(Request request) {
        System.out.println("    [Reception] matchRequest() called");

        matcherManager.newMatcher(request);
    }

    public void acceptRequest(Responder responder, Request request) {
        System.out.println("    [Reception] acceptRequest() called");

        matcherManager.acceptRequest(request, responder);
    }

    public void declineRequest(Responder responder, Request request) {
        System.out.println("    [Reception] declineRequest() called");

        matcherManager.declineRequest(request, responder);
    }
}