package home_work_sem_2.min_max_diff;

import home_work_sem_2.ArrayService;

import java.util.Random;

public class MaxMInDifferenceArrayService extends ArrayService {

    public static int[] autoFillArray(int[] arr, int minForRandom, int MaxForRandom){

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(minForRandom, MaxForRandom);
        }
        MaxMinDifferenceDecorator.decorateOutput("Ваш массив: %s\n", arr);
        MaxMinDifferenceDecorator.decorateOutput(
                "Максимальное значение в вашем массиве %s: ",
                MaxMinDifferenceService.findMax(arr));

        MaxMinDifferenceDecorator.decorateOutput(
                "\nМинимальное значение в вашем массиве %s: ",
                MaxMinDifferenceService.findMin(arr));

        return arr;
    }
}
