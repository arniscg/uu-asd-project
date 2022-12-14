package src;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Scheduler {
    ArrayList<ScheduledJob> jobs;

    public Scheduler() {}
    public void addJob(Job job) {
        System.out.println("[Scheduler] Scheduled a job");
    }
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

class PaymentJob implements Job {
    PaymentDetails details;
    ThirdPartyPaymentServices paymentServices;

    public PaymentJob(PaymentDetails details) {
        System.out.println("[PaymentJob] Created");
    }

    public void execute() {}
}

class RequestUpdateJob implements Job {
    Request request;

    public RequestUpdateJob(Request request) {}
    public void execute() {}
}

class ConfirmRequestJob implements Job {
    Request request;

    public ConfirmRequestJob(Responder responder, Request request) {
        System.out.println("[CreateRequestJob] Created");
    }
    public void execute() {}
}

class ConfirmedConnectionJob implements Job {
    Request request;

    public ConfirmedConnectionJob(Request request) {
        System.out.println("[ConfirmedConnectionJob] Created");
    }

    public void execute() {}
}