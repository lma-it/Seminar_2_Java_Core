package class_work_sem_2.array_task;

public class ArrayTaskMain {
    public static void main(String[] args) {

        Decorator.decorateOutput(
                ArrayService.addElement(
                        ArrayService.fillArray(
                                ArrayService.createArray()),
                        InputService.inputValue())
        );

        Decorator.decorateOutput(
                ArrayService.insertElementByIndex(
                        ArrayService.fillArray(
                                ArrayService.createArray()),
                        InputService.inputValue(),
                        InputService.inputIndex())
        );
    }
}
