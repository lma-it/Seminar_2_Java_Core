package home_work_sem_2.min_max_diff;

import java.util.Arrays;

public class MaxMinDifferenceService {

    public static int findDifferenceBetweenMaxAndMin(int[] array){
        return findMax(array) - findMin(array);
    }

    public static int findMax(int[] array){
        return Arrays.stream(array).max().getAsInt();
    }

    public static int findMin(int[] array){
        return Arrays.stream(array).min().getAsInt();
    }
}
