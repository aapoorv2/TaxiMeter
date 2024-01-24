package org.example;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class RidesTest {
    @Test
    @DisplayName("total sum of two fares (1, 3) and (5, 2) is 91")
    void test1() {
        Fare fare1 = new Fare(1, 3);
        Fare fare2 = new Fare(5, 2);
        List<Fare> fares = new ArrayList<>();
        fares.addAll(Arrays.asList(fare1, fare2));
        Rides rides = new Rides(fares);
        assertEquals(91, rides.calculateTotalFare(), 0.01);
    }
    @Test
    @DisplayName("total sum of 3 fares (10, 0) and (5, 2) is 91")
    void test2() {
        Fare fare1 = new Fare(10, 0);
        Fare fare2 = new Fare(5, 2);
        Fare fare3 = new Fare(20, 10);
        List<Fare> fares = new ArrayList<>();
        fares.addAll(Arrays.asList(fare1, fare2, fare3));
        Rides rides = new Rides(fares);
        assertEquals(453.84, rides.calculateTotalFare(), 0.01);
    }

}