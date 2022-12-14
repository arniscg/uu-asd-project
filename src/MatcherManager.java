package src;

import java.util.ArrayList;
import java.util.List;

class Match {
    Requester requester;
    Responder responder;
    Feedback requesterFeedbacks[];
    Feedback responderFeedbacks[];

    public Match(Requester requester, Responder responder) {
        System.out.println("    [Match] Created");
    }
    public int getMatchScore() {
        System.out.println("    [Match] getMatchScore() called");
        return 5;
    }
}

class MatchCandidates {
    ArrayList<Match> matches;
    Request request;

    public MatchCandidates(Request request) {
        this.request = request;
        this.matches = new ArrayList<Match>();
        this.findMatches();

        System.out.println("    [MatchCandidates] Created");
    }

    public ArrayList<Responder> getBestResponders(int count) {
        System.out.println("    [MatchCandidates] getBestResponders() called");
        ArrayList<Responder> responders = new ArrayList<Responder>();
        for (int i = 0; i < count; i = i+1) {
            matches.get(i).getMatchScore(); // Dummy call
            responders.add(matches.get(i).responder);
            // In real implementatoin would sort candidates by score probably
        }
        return responders;
    }

    void findMatches() {
        System.out.println("    [MatchCandidates] findMatches() called");
        // Add dummy matches
        // Would search database in real code
        for (int i = 0; i < 9; i = i+1) {
            Requester req = new Requester("", "", "");
            Responder res = new Responder("", "", "");
            Match newMatch = new Match(req, res);
            matches.add(newMatch);
        }
    }
}

class Matcher {
    MatchCandidates matchCandidates;
    Request request;
    Scheduler scheduler;

    public Matcher(Request request, Scheduler scheduler) {
        System.out.println("    [Matcher] Creating new MatchCandidates");
        this.scheduler = scheduler;
        this.request = request;
        matchCandidates = new MatchCandidates(request);

        notifyCandidates();

        System.out.println("    [Matcher] Created");
    }
    public void accept(Request request, Responder responder) {
        System.out.println("    [Matcher] accept() called");

        System.out.println("    [Matcher] Destroying matchCandidates");
        // Delete candidates (not needed anymore)
        this.matchCandidates = null;
        
        // request.setResponder(responder);
        // Update Request in database

        // Schedule a payment job
        PaymentDetails details = null; // Dummy details
        PaymentJob paymentJob = new PaymentJob(details);
        scheduler.addJob(paymentJob); // Asynchronous

        // Schedule confirmed confiramtion job (notify users)
        ConfirmedConnectionJob connectionJob = new ConfirmedConnectionJob(request);
        scheduler.addJob(connectionJob); // Asynchronous
    }

    public void decline(Request request, Responder responder) {
        System.out.println("    [Matcher] decline() called");

        // Check if enough responders have declined and then
        // notify the next potential responder batch
        notifyCandidates();
    }

    private void notifyCandidates() {
        System.out.println("    [Matcher] notifyCandidates() called");
        ArrayList<Responder> responders = matchCandidates.getBestResponders(3);

        for (Responder responder : responders) {
            ConfirmRequestJob job = new ConfirmRequestJob(responder, request);
            scheduler.addJob(job); // Asynchronous
        }
    }
}

public class MatcherManager {
    List<Matcher> matchers;
    Scheduler scheduler;

    public MatcherManager(Scheduler scheduler) {
        this.matchers = new ArrayList<Matcher>();
        this.scheduler = scheduler;
    }

    public void newMatcher(Request request) {
        System.out.println("    [MatcherManager] newMatcher() called");

        System.out.println("    [MatcherManager] Creating new Matcher");
        Matcher matcher = new Matcher(request, scheduler);
        matchers.add(matcher);
    }
    
    public void acceptRequest(Request request, Responder responder) {
        System.out.println("    [MatcherManager] acceptRequest() called");
    
        Matcher matcher = matchers.get(0); // Find relevant matcher
        matcher.accept(request, responder);
    }

    public void declineRequest(Request request, Responder responder) {
        System.out.println("    [MatcherManager] declineRequest() called");
    
        Matcher matcher = matchers.get(0); // Find relevant matcher
        matcher.decline(request, responder);
    }
}