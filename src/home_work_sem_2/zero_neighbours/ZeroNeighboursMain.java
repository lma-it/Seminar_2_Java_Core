package home_work_sem_2.zero_neighbours;

public class ZeroNeighboursMain {

    public static void main(String[] args) {

        ZeroNeighboursDecorator.decorateOutput(
                "Если в массиве для соседних нуля? Вот в чем вопрос. Ответ: %s",
                ZeroNeighboursService.isZeroNeighboursInArray(
                        ZeroNeighboursArrayService.autoFillArray(
                                ZeroNeighboursArrayService.createArray(
                                "Введите размер массива: "
                                ),
                                0,
                                8
                        )
                )
        );

    }
}
