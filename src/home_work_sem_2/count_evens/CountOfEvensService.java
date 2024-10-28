package home_work_sem_2.count_evens;

import java.util.Arrays;

public class CountOfEvensService {

    public static int countOfEvens(int[] array){
        return (int) Arrays.stream(array)
                .filter(value -> value % 2 == 0)
                .count();
    }

}
