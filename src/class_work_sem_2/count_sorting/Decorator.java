package class_work_sem_2.count_sorting;

import java.util.Arrays;

public class Decorator {

    public static void decorateOutput(String coupleOfWordsAboutArray, int[] arr){
        System.out.printf(coupleOfWordsAboutArray, Arrays.toString(arr));
    }
}
