package src;

import src.gui.controller.*;
import src.gui.view.*;

// Main
public class PetSit {
    public static void main(String[] args) {
        // Create singleton objects (not singleton right now)
        Scheduler scheduler = new Scheduler();
        MatcherManager matcherManager = new MatcherManager(scheduler);
        Reception reception = new Reception(matcherManager);
        // Create GUI components
        CreateRequestView createRequestView = new CreateRequestView();
        RequestConfirmationView requestConfirmView = new RequestConfirmationView();
        CreateRequestController createRequestController = new CreateRequestController(createRequestView, reception);
        ConfirmationController confirmationController = new ConfirmationController(requestConfirmView, reception);

        // Following lines are the sequence diagram workflowS

        // Sequence diagrams 1 and 2: Creating a match
        createRequestController.onCreatePressed(); // Imitate user pressing a "Create Request" button

        // Sequence diagram 3: Declining a match
        confirmationController.onConfirmationButtonPressed(false); // Imitate user pressing "decline"

        // Sequence diagram 3: Accepting a match
        confirmationController.onConfirmationButtonPressed(true); // Imitate user pressing "accept"
    }
}