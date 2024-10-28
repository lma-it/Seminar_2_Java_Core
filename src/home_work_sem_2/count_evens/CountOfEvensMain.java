package home_work_sem_2.count_evens;

public class CountOfEvensMain {
    public static void main(String[] args) {
        CountOfEvensDecorator.decorateOutput(
                "Количество четных элементов в массиве %s",
                CountOfEvensService.countOfEvens(
                        CountOfEvensArrayService.autoFillArray(
                                CountOfEvensArrayService.createArray(
                                        "Введите размер массива: "
                                ),
                                0,
                                10
                        )
                )
        );
    }
}
