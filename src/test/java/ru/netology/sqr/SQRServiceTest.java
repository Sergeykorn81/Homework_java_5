package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason() {
        SQRService service = new SQRService();
        int expected = 3;

        int actual = service.countingNumbersOfSquares(200, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason1() {
        SQRService service = new SQRService();
        int expected = 8;

        int actual = service.countingNumbersOfSquares(100, 300);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountingNumbersOfSquaresNotInDiapason() {
        SQRService service = new SQRService();
        int expected = 7;

        int actual = service.countingNumbersOfSquares(100, 300);

        assertNotEquals(expected, actual);
    }

    @Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason2() {
        SQRService service = new SQRService();
        int expected = 1;

        int actual = service.countingNumbersOfSquares(100, 101);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason3() {
        SQRService service = new SQRService();
        int expected = 0;

        int actual = service.countingNumbersOfSquares(0, 99);

        assertEquals(expected, actual);
    }

    @Test
    void shouldCountingNumbersOfSquaresInTheLimitOfDiapason4() {
        SQRService service = new SQRService();
        int expected = 0;

        int actual = service.countingNumbersOfSquares(300, 300);

        assertEquals(expected, actual);
    }
}


