package home_work_sem_2;

import java.util.Arrays;

public abstract class Decorator {

    public static void decorateOutput(String coupleOfWordsAboutValue, int value){
        System.out.printf(coupleOfWordsAboutValue, value);
    }

    public static void decorateOutput(String coupleOfWordsAboutArray, int[] array){
        System.out.printf(coupleOfWordsAboutArray, Arrays.toString(array));
    }
}
