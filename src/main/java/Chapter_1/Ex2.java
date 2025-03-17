package Chapter_1;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer value = null;

        while (value == null) {
            System.out.println("Введите число: ");
            if (scanner.hasNextInt()) {
                value = scanner.nextInt();
            } else {
                System.out.println("Необходимо ввести именно число!");
                scanner.next();
            }
        }

        int square = value * value;
        System.out.println("Квадрат числа " + value + " равен: " + square);
        scanner.close();
    }
}
