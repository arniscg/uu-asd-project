package src.gui.controller;

import src.Request;
import src.gui.view.RequestConfirmationView;

public class ConfirmationController {
    RequestConfirmationView view;
    Request request;

    public ConfirmationController(RequestConfirmationView view) {}
    public void displayConfirmation(Request request) {}
    // Event handlers
    public void onConfirmationButtonPressed(boolean confirmation) {
        if (confirmation) {
            System.out.println("[ConfirmationController] User pressed Accept button");
        } else {
            System.out.println("[ConfirmationController] User pressed Decline button");
        }
    }
}
