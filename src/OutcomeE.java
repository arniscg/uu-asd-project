package src;
import java.time.LocalDateTime;

import src.User;
import src.Reception;
import src.Preferences;
import src.Request;
import src.MatcherManager;
import src.Scheduler;
import src.gui.controller.*;
import src.gui.view.*;

// Main
public class OutcomeE {
    public static void main(String[] args) {
        // Create singleton objects (not singleton right now)
        Scheduler scheduler = new Scheduler();
        MatcherManager matcherManager = new MatcherManager(scheduler);
        Reception reception = new Reception(matcherManager);
        // Create GUI components
        CreateRequestView createRequestView = new CreateRequestView();
        RequestConfirmationView requestConfirmView = new RequestConfirmationView();
        CreateRequestController createRequestController = new CreateRequestController(createRequestView, reception);
        ConfirmationController confirmationController = new ConfirmationController(requestConfirmView);

        // Following lines are the sequence diagram workflow

        // Imitate user pressing a "Create Request" button
        createRequestController.onCreatePressed();
        // Imitate user pressing "accept"
        confirmationController.onConfirmationButtonPressed(true);
        // Imitate user pressing "decline"
        confirmationController.onConfirmationButtonPressed(false);
    }
}