package src.gui.controller;

import src.Reception;
import src.Request;
import src.Responder;
import src.gui.view.RequestConfirmationView;

public class ConfirmationController {
    RequestConfirmationView view;
    Request request;
    Reception reception;

    public ConfirmationController(RequestConfirmationView view, Reception reception) {
        this.view = view;
        this.reception = reception;
    }

    public void displayConfirmation(Request request) {}
    Responder responder = new Responder("", "", ""); // The user
    // Event handlers
    public void onConfirmationButtonPressed(boolean confirmation) {
        if (confirmation) {
            System.out.println("[ConfirmationController] User pressed Accept button");
            reception.acceptRequest(responder, request);
        } else {
            System.out.println("[ConfirmationController] User pressed Decline button");
            reception.declineRequest(responder, request);
        }
    }
}
