package class_work_sem_2.array_task;

import java.util.Arrays;

public class Decorator {
    public static void decorateOutput(int[] array){
        System.out.println(Arrays.toString(array));
    }

    public static void messageForUser(String message){
        System.out.println(message);
    }

    public static void messageForUser(String message, int value){
        System.out.printf((message) + "%n", value);
    }
}
