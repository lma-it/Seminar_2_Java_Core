package home_work_sem_2.zero_neighbours;

import home_work_sem_2.Decorator;

public class ZeroNeighboursDecorator extends Decorator {

    public static void decorateOutput(String coupleOfWordsAboutValue, boolean value){
        System.out.printf(coupleOfWordsAboutValue, translate(value));
    }

    private static String translate(boolean value){

        if(value) return String.format(
                "Есть. Их позиции %s и %s",
                ZeroNeighboursService.getPositions()[0],
                ZeroNeighboursService.getPositions()[1]);

        return "Нету.";
    }
}
