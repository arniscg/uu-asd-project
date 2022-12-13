package src;
import java.time.LocalTime;
import java.util.List;

class RepeatingTimeRange {
    LocalTime startTime;
    LocalTime endTime;
    int repeatWeekDays[];

    public RepeatingTimeRange(LocalTime startTime, LocalTime endTime, int repeatWeekDays[]) {}
}

class Availability {
    List<RepeatingTimeRange> timeRanges;

    public Availability() {}

    public void addTimeRange(LocalTime startTime, LocalTime endTime, int repeatWeekDays[]) {
        timeRanges.add(new RepeatingTimeRange(startTime, endTime, repeatWeekDays));
    }

    public boolean isAvailable() { return true; }
}

public class Preferences {
    PetType[] petTypes;
    Availability availability;
    int locationRadius;

    public Preferences() {}

    // Setters
    public void setPetTypes(PetType[] pets) { this.petTypes = pets; }
    public void updateAvailability() {}
    public void setLocationRadius(int radius) { this.locationRadius = radius; }
    // Getters
    public PetType[] getPetTypes() { return this.petTypes; }
    public Availability getAvailability() { return this.availability; }
    public int getLocationRadius() { return this.locationRadius; }
}