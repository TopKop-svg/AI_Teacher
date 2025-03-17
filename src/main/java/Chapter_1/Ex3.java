package Chapter_1;

import java.util.Scanner;

public class Ex3 {
    static String hasContinue;
    public static void main(String[] args) {
        Ex3 ex3 = new Ex3();
        Scanner scanner = new Scanner(System.in);
        hasContinue = "да";


        while (true) {
            ex3.getSquare(scanner);
            if (hasContinue.equalsIgnoreCase("нет")) {
                break;
            } else {
                System.out.println("Введите коректную команду!");
            }


        }
        scanner.close();
    }

    public void getSquare(Scanner scanner) {
        Double value = null;
        while (value == null) {
            System.out.println("Введите число: ");
            if (scanner.hasNextDouble()) {
                value = scanner.nextDouble();
            } else {
                System.out.println("Необходимо ввести именно число!");
                scanner.next();
            }
        }
        double square = value * value;
        System.out.println("Квадрат числа " + value + " равен: " + square);
        System.out.println("Хотите продолжить? ");
        Ex3.hasContinue = scanner.next();
    }
}
