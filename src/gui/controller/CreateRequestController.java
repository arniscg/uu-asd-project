package src.gui.controller;

import src.gui.view.CreateRequestView;

import java.util.ArrayList;

import src.Location;
import src.PetType;
import src.Requester;
import src.TimeRange;

public class CreateRequestController {
    CreateRequestView view;
    Requester requester;
    TimeRange time;
    Location location;
    ArrayList<PetType> petTypes;
    
    public CreateRequestController(CreateRequestView view) {}
    // Event handlers
    public void onCreatePressed() {}
}
