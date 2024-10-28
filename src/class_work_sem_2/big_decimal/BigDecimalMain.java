package class_work_sem_2.big_decimal;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigDecimalMain {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        BigDecimal a = BigDecimal.valueOf(2);

        System.out.println("Enter your number");
        Scanner scanner = new Scanner(System.in);
        BigDecimal b = scanner.nextBigDecimal();

        System.out.println(b.multiply(a));

        System.out.println(373 >> 3);
        System.out.println(373 << 3);


    }
}