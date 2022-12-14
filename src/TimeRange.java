package src;

import java.time.LocalDateTime;

public class TimeRange {
    LocalDateTime startTime;
    LocalDateTime endTime;

    public TimeRange(LocalDateTime startTime, LocalDateTime endTime) {}

    boolean isInRange(TimeRange range) { return true; }
}