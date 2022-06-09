package ru.netology.sqr.services;

import static org.junit.jupiter.api.Assertions.*;

public class SQRServiceTest {

    @org.junit.jupiter.api.Test
    void testConditions() {
        SQRService service = new SQRService();

        int min = 200;
        int max = 300;
        int expected = 3;


        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testMinBoundaryValues() {
        SQRService service = new SQRService();

        int min = 100;
        int max = 100;
        int expected = 1;

        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testMaxBoundaryValues() {
        SQRService service = new SQRService();


        int min = 9801;
        int max = 9801;
        int expected = 1;

        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testBoundaryValues() {
        SQRService service = new SQRService();

        int min = 100;
        int max = 9801;
        int expected = 90;

        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testMinMoreMax() {
        SQRService service = new SQRService();

        int min = 300;
        int max = 200;
        int expected = 0;

        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testToTheLowerBount() {
        SQRService service = new SQRService();

        int min = 25;
        int max = 50;
        int expected = 0;

        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void testUpMinLimit() {
        SQRService service = new SQRService();

        int min = 9850;
        int max = 9999;
        int expected = 0;

        long actual = service.numberSquares(min, max);

        assertEquals(expected, actual);
    }
}
