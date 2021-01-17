package ru.netology.statistic;

import java.util.ArrayList;
import java.util.List;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;

        }
        return sum;
    }

    public long findMax(long[] purchases) {
        long currentMax = purchases[0];
        for (long purchase : purchases) {
            if (currentMax < purchase) {
                currentMax = purchase;
            }
        }
        return currentMax;
    }

    public long findMin(long[] purchases) {
        long currentMin = purchases[0];
        for (long purchase : purchases) {
            if (currentMin > purchase) {
                currentMin = purchase;
            }
        }
        return currentMin;
    }

    public double calculateAverage(long[] purchases) {
        return calculateSum(purchases) / purchases.length;
    }

    public List<Integer> findMaxAll(long[] purchases) {
        long maxValue = findMax(purchases);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < purchases.length; i++) {
            long monthSales = purchases[i];
            if (monthSales == maxValue) {
                list.add(i);
            }
        }
        return list;
    }

    public List<Integer> findMinAll(long[] purchases) {
        long minValue = findMin(purchases);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < purchases.length; i++) {
            long monthSales = purchases[i];
            if (monthSales == minValue) {
                list.add(i);
            }
        }
        return list;
    }

    public int findLessAverageCount(long[] purchases) {
        int count = 0;
        double average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase < average){
                count++;
            }
        }
        return count;
    }

    public int findMoreAverageCount(long[] purchases) {
        int count = 0;
        double average = calculateAverage(purchases);
        for (long purchase : purchases) {
            if (purchase > average){
                count++;
            }
        }
        return count;
    }

}
