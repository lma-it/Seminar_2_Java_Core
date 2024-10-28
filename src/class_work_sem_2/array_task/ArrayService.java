package class_work_sem_2.array_task;

import java.util.Arrays;

public class ArrayService {

    public static int[] addElement(int[] arr, int value){
        int[] array = Arrays.copyOf(arr, arr.length + 1);
        array[arr.length] = value;
        return array;
    }

    public static int[] insertElementByIndex(int[] arr, int value, int index){
        if(index < 0){
            throw new RuntimeException("НЕЛЬЗЯ ВВОДИТЬ ИНДЕКС МЕНЬШЕ 0!!!");
        }
        int[] array = new int[arr.length + 1];
        array[index] = value;
        if (index == 0){
            System.arraycopy(arr, 0, array,1, arr.length);
            return array;
        }else if(index < array.length){
            System.arraycopy(arr, 0, array, 0, index);
            System.arraycopy(arr, index, array, index + 1, arr.length - index);
            return array;
        }
        return addElement(arr, value);
    }


    public static int[] fillArray(int[] array){
        for (int i = 0; i < array.length; i++){
            Decorator.messageForUser("Введите %s элемент вашего массива: ", i + 1);
            array[i] = InputService.input();
        }
        return array;
    }

    public static int[] createArray(){
        Decorator.messageForUser("Введите размер массива. Учитывайте, что заполнять его надо в ручную: ");
        return new int[InputService.input()];
    }
}
