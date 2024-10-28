package home_work_sem_2;

import home_work_sem_2.count_evens.CountOfEvensDecorator;

import java.util.Random;
import java.util.Scanner;

public abstract class ArrayService {

    public static int[] autoFillArray(int[] arr, int minForRandom, int MaxForRandom){

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(minForRandom, MaxForRandom);
        }
        CountOfEvensDecorator.decorateOutput("Ваш массив: %s\n", arr);
        return arr;
    }

    public static int[] createArray(String rememberAboutSize){
        System.out.println(rememberAboutSize);
        return new int[new Scanner(System.in).nextInt()];
    }
}
