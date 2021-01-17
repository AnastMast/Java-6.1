package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StatisticsServiceTest {
    @Test
    void calculateSum() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 20;

        long actual = service.findMax(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateAverage() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        double expected = 15;
        double actual = service.calculateAverage(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMaxMonthSales() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        List<Integer> expected = new ArrayList<>();
        //add expected month indexes
        expected.add(5);
        expected.add(7);

        List<Integer> actual = service.findMaxAll(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMinMonthSales() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 7, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        List<Integer> expected = new ArrayList<>();
        //add expected month indexes
        expected.add(1);
        expected.add(8);

        List<Integer> actual = service.findMinAll(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateLessAverageCount() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5 ;
        double actual = service.findLessAverageCount(purchases);

        assertEquals(expected, actual);
    }

    @Test
    void calculateMoreAverageCount() {
        StatisticsService service = new StatisticsService();

        long[] purchases = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5 ;
        double actual = service.findMoreAverageCount(purchases);

        assertEquals(expected, actual);
    }

}