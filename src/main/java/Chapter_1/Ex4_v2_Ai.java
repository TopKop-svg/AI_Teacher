package Chapter_1;

import java.util.Scanner;

public class Ex4_v2_Ai {
    public static void main(String[] args) {
        Ex4_v2_Ai ex = new Ex4_v2_Ai();
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            ex.runCalculator(scanner);
            continueProgram = ex.askToContinue(scanner);
        }
        scanner.close();
        System.out.println("Программа завершена.");
    }

    public void runCalculator(Scanner scanner) {
        double first = getNumber(scanner, "Введите первое число: ");
        double second = getNumber(scanner, "Введите второе число: ");
        char operation = getOperation(scanner);
        calculate(first, second, operation);
    }

    public double getNumber(Scanner scanner, String prompt) {
        while (true) {
            System.out.println(prompt);
            if (scanner.hasNextDouble()) {
                double number = scanner.nextDouble();
                scanner.nextLine(); // Очищаем буфер
                return number;
            } else {
                System.out.println("Ошибка: введите корректное число!");
                scanner.nextLine(); // Очищаем некорректный ввод
            }
        }
    }

    public char getOperation(Scanner scanner) {
        while (true) {
            System.out.println("Введите операцию (+, -, *, /): ");
            String input = scanner.nextLine().trim();
            if (input.length() == 1 && "+-*/".contains(input)) {
                return input.charAt(0);
            } else {
                System.out.println("Ошибка: введите одну из операций: +, -, *, /");
            }
        }
    }

    public void calculate(double first, double second, char operation) {
        switch (operation) {
            case '+':
                System.out.println("Результат: " + (first + second));
                break;
            case '-':
                System.out.println("Результат: " + (first - second));
                break;
            case '*':
                System.out.println("Результат: " + (first * second));
                break;
            case '/':
                if (second == 0) {
                    System.out.println("Ошибка: деление на ноль!");
                } else {
                    System.out.println("Результат: " + (first / second));
                }
                break;
        }
    }

    public boolean askToContinue(Scanner scanner) {
        while (true) {
            System.out.println("Хотите продолжить? (да/нет): ");
            String answer = scanner.nextLine().trim().toLowerCase();
            if (answer.equals("да")) {
                return true;
            } else if (answer.equals("нет")) {
                return false;
            } else {
                System.out.println("Введите 'да' или 'нет'!");
            }
        }
    }
}