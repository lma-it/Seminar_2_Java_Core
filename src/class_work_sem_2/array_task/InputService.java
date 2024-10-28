package class_work_sem_2.array_task;

import java.util.Scanner;

public class InputService {

    static int input(){
        return new Scanner(System.in).nextInt();
    }

    public static int inputValue(){
        Decorator.messageForUser("Введите число, которое хотите вставить в массив: ");
        return InputService.input();
    }

    public static int inputIndex(){
        Decorator.messageForUser("Введите индекс (ТОЛЬКО БОЛЬШЕ 0!!!), по которому хотите вставить свое число в массив: ");
        return InputService.input();
    }
}
