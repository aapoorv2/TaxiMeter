package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FareTest {
    @Test
    @DisplayName("Check if time and dist are negative and throws an exception")
    void checkIfNegativeAndThrowsError() {
        assertThrows(RuntimeException.class, () -> {
            Fare far = new Fare(-1, -2);
        });
    }
    @Test
    @DisplayName("If distance travelled is 5km and time waited is 2s, fare must be 89")
    void calculatefare1() {
        Fare fare = new Fare(5, 2);
        int actual = fare.calculateFare();
        assertEquals(89, actual);
    }
    @Test
    @DisplayName("If distance travelled is 1km and time waited is 0s, fare must be 37")
    void calculatefare2() {
        Fare fare = new Fare(1, 0);
        int actual = fare.calculateFare();
        assertEquals(37, actual);
    }
}