package src;

import java.time.LocalDateTime;

public class TimeRange {
    LocalDateTime startTime;
    LocalDateTime endTime;

    public TimeRange(LocalDateTime startTime, LocalDateTime endTime) {
        System.out.println("[TimeRange] Created");
    }

    boolean isInRange(TimeRange range) { return true; }
}