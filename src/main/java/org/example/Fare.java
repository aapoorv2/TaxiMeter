package org.example;

public class Fare {
    private final int RATE = 12;
    private final int MIN_FAIR = 25;
    private final int WAITING_CHARGE = 2;
    private int waiting_time;
    private int dist;
    Fare(int dist, int waiting_time) {
        if (dist < 0 || waiting_time < 0) {
            throw new RuntimeException();
        }
        this.dist = dist;
        this.waiting_time = waiting_time;
    }

    int calculateFare() {
        return MIN_FAIR + WAITING_CHARGE * waiting_time + dist * RATE;
    }

}
