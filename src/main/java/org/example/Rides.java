package org.example;
import java.util.List;
public class Rides {
    private final List<Fare> fares;
    Rides(List<Fare> fares) {
        this.fares = fares;
    }
    double calculateTotalFare() {
        double totalFare = 0;
        for (Fare fare : fares) {
            totalFare += fare.calculate();
        }
        return totalFare;
    }
//    double calculateTotalServiceFeePaid() {
//        double totalServiceFee = 0;
//        for (Fare fare : fares) {
//            totalServiceFee += fare.;
//        }
//        return totalServiceFee;
//    }

}
