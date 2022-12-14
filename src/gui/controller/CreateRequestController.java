package src.gui.controller;

import src.gui.view.CreateRequestView;

import java.time.LocalDateTime;
import java.util.ArrayList;

import src.Location;
import src.PetType;
import src.Reception;
import src.Request;
import src.Requester;
import src.TimeRange;

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
    // Event handlers
    public void onCreatePressed() {
        System.out.println("[CreateRequestController] User pressed Create Request button");

        // Create a new request
        Request newRequest = new Request(
            requester, startTime, endTime, petTypes,
            address, coordinates, description);

        // Ask Reception to start matching the request
        reception.matchRequest(newRequest);
    }
}
