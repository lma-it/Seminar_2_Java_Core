package class_work_sem_2.count_sorting;

import java.util.Random;
import java.util.Scanner;

public class ArrayService {

    public static int[] autoFillArray(int[] arr){

        for(int i = 0; i < arr.length; i++){
            arr[i] = new Random().nextInt(0, 10);
        }
        Decorator.decorateOutput("Ваш изначальный массив: %s\n", arr);
        return arr;
    }

    public static int[] createArray(String rememberAboutSize){
        System.out.println(rememberAboutSize);
        return new int[new Scanner(System.in).nextInt()];
    }
}
