package src;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Scheduler {
    ArrayList<ScheduledJob> jobs;

    public Scheduler() {}
    public void addJob(Job job) {}
}

class ScheduledJob {
    Job job;
    LocalDateTime time;

    public ScheduledJob(Job job, LocalDateTime time) {}
}

interface Job {
    public void execute();
}

class ThirdPartyPaymentServices {}

class PaymentJob {
    PaymentDetails details;
    ThirdPartyPaymentServices paymentServices;

    public PaymentJob(PaymentDetails details, ThirdPartyPaymentServices paymentServices) {}
    public void execute() {}
}

class RequestUpdateJob {
    Request request;

    public RequestUpdateJob(Request request) {}
    public void execute() {}
}

class ConfirmRequestJob {
    Request request;

    public ConfirmRequestJob(Request request) {}
    public void execute() {}
}

class ConfirmedConnectionJob {
    Request request;

    public ConfirmedConnectionJob(Request request) {}
    public void execute() {}
}