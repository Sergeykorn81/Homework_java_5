package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason() {
        SQRService service = new SQRService();
        int expected = 3;

        int actual = service.countingNumbersOfSquares(200, 300);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason1() {
        SQRService service = new SQRService();
        int expected = 8;

        int actual = service.countingNumbersOfSquares(100, 300);

        assertEquals(expected, actual);
    }
}


