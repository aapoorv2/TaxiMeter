package org.example;

public class Fare {
    private final double RATE = 12;
    private final double MIN_FARE = 25;
    private final double WAITING_CHARGE = 2;
    private final double BASE_CHARGE = 2;
    private final double STEP_SIZE = 0.1;
    private final double SERVICE_FEE = 0.01;
    private final double waiting_time;
    private final double dist;
    private double service_fee_paid;
    private double base_price;
    private double total_fare;
    Fare(double dist, double waiting_time) {
        if (dist < 0 || waiting_time < 0) {
            throw new RuntimeException();
        }
        this.dist = dist;
        this.waiting_time = waiting_time;
        this.service_fee_paid = 0;
    }

    double calculate() {
        total_fare = BASE_CHARGE + WAITING_CHARGE * waiting_time + dist * RATE;
        base_price = total_fare;
        if (base_price > 100) {
            service_fee_paid = base_price * SERVICE_FEE;
            total_fare = service_fee_paid + base_price;
        }
        return Math.max(MIN_FARE, total_fare);
    }

}
