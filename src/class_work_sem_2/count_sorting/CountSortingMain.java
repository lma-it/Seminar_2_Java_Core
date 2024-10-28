package class_work_sem_2.count_sorting;

public class CountSortingMain {

    public static void main(String[] args) {

       Decorator.decorateOutput(
               "Отсортированный массив: %s",
               SortingService.sort(
                       ArrayService.autoFillArray(
                               ArrayService.createArray(
                                       "Введите размер массива: "
                               )
                       )
               )
       );

    }
}
