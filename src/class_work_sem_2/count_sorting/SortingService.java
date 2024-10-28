package class_work_sem_2.count_sorting;

import java.util.HashMap;

public class SortingService {

    public static int[] sort(int[] arr){

        int[] sortedArray = new int[arr.length];
        HashMap<Integer, Integer> counterOfValues = new HashMap<>();

        for (int j : arr) {
            counterOfValues.put(j, counterOfValues.getOrDefault(j, 0) + 1);
        }

        int index = 0;
        for (int key : counterOfValues.keySet()) {
            int count = counterOfValues.get(key);
            for (int j = 0; j < count; j++) {
                sortedArray[index++] = key;
            }
        }

        return sortedArray;
    }
}
