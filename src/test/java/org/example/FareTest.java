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
    @DisplayName("If the distance travelled is 0km and time waited is 0s, the fare must be 25")
    void calculateMinfare1() {
        Fare fare = new Fare(0, 0);
        double actual = fare.calculate();
        assertEquals(25, actual);
    }
    @Test
    @DisplayName("If the distance travelled is 1km and time waited is 3s, the fare must be 25")
    void calculateMinfare2() {
        Fare fare = new Fare(1, 3);
        double actual = fare.calculate();
        assertEquals(25, actual);
    }
    @Test
    @DisplayName("If the distance travelled is 5km and time waited is 2s, the fare must be 66")
    void calculatefare1() {
        Fare fare = new Fare(5, 2);
        double actual = fare.calculate();
        assertEquals(66, actual);
    }
    @Test
    @DisplayName("If the distance travelled is 5km and time waited is 5s, the fare must be 72")
    void calculatefare2() {
        Fare fare = new Fare(5, 5);
        double actual = fare.calculate();
        assertEquals(72, actual);
    }
    @Test
    @DisplayName("If the distance travelled is 10km and time waited is 0s, the fare must be 123.22")
    void calculatefare3() {
        Fare fare = new Fare(10, 0);
        double actual = fare.calculate();
        assertEquals(123.22, actual, 0.01);
    }
    @Test
    @DisplayName("If the distance travelled is 20km and time waited is 10s, the fare must be 264.62")
    void calculatefare4() {
        Fare fare = new Fare(20, 10);
        double actual = fare.calculate();
        assertEquals(264.62, actual, 0.01);
    }
}