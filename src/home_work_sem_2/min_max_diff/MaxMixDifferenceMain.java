package home_work_sem_2.min_max_diff;

public class MaxMixDifferenceMain {
    public static void main(String[] args) {
        MaxMinDifferenceDecorator.decorateOutput(
                "\nРазница между максимальным и минимальным элементом массива: %s",
                MaxMinDifferenceService.findDifferenceBetweenMaxAndMin(
                        MaxMInDifferenceArrayService.autoFillArray(
                                MaxMInDifferenceArrayService.createArray(
                                        "Введите размер массива: "),
                                -10,
                                10)
                )
        );
    }
}
