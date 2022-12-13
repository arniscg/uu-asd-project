package src;

import java.util.ArrayList;
import java.util.List;

class Match {
    Requester requester;
    Responder responder;
    Feedback requesterFeedbacks[];
    Feedback responderFeedbacks[];

    public Match(Requester requester, Responder responder) {}
    public int getMatchScore() { return 5; }
}

class MatchCandidates {
    List<Match> matches;
    Request request;

    public MatchCandidates(Request request) {
        this.request = request;
        this.findMatches();
    }

    public List<Responder> getBestResponders(int count) { return new ArrayList<Responder>(); }

    void findMatches() {}
}

class Matcher {
    MatchCandidates matchCandidates;
    Request request;

    public Matcher(Request request) {}
    public void accept(Request request, Responder responder) {}
    public void decline(Request request, Responder responder) {}

    void notifyCandidate() {}
}

public class MatcherManager {
    List<Matcher> matchers;

    public MatcherManager() {}
    public void newMatcher(Request request) {}
    public void acceptRequest(Request request, Responder responder) {}
    public void declineRequest(Request request, Responder responder) {}
}