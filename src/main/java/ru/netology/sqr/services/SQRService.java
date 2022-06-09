package ru.netology.sqr.services;

public class SQRService {
    public int numberSquares(int min, int max) {
        int count = 0;
        int sqr;
        for (int i = 10; i <= 99; i++) {
            sqr = i * i;
            if (sqr >= min && sqr <= max) {
                count++;
            }
        }
        return count;
    }
}
