package ru.netology.sqr;

public class SQRService {
    public int countingNumbersOfSquares(int numberUp, int numberTo) {
        int counter = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= numberUp && i * i <= numberTo) {
                counter++;
            }
        }
        return counter;
    }
}