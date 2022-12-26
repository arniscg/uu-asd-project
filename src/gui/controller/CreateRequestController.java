package src.gui.controller;

import src.gui.view.CreateRequestView;

import java.time.LocalDateTime;
import java.util.ArrayList;

import src.PetType;
import src.Reception;
import src.Request;
import src.Requester;

public class CreateRequestController {
    CreateRequestView view;
    Reception reception;
    Requester requester;
    // Input fields
    LocalDateTime startTime;
    LocalDateTime endTime;
    ArrayList<PetType> petTypes;
    String address;
    double[] coordinates;
    String description;
    
    public CreateRequestController(CreateRequestView view, Reception reception) {
        this.view = view;
        this.reception = reception;
    }

    public boolean validateInput() {
        return true;
    }

    // Event handlers
    public void onCreatePressed() {
        System.out.println("\n[CreateRequestController] User pressed Create Request button");

        if (!validateInput()) {
            // Handle the input errors
        }

        // Create a new request
        Request newRequest = new Request(
            requester, startTime, endTime, petTypes,
            address, coordinates, description);

        // Save the request into databse

        // Ask Reception to start matching the request
        // This would be an asynchronous function call
        reception.matchRequest(newRequest);
    }
}