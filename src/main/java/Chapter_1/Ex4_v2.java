package Chapter_1;

import java.util.Scanner;

public class Ex4_v2 {
    static boolean hasNext = false;
    static int value;
    static StringBuilder stb;
    public static void main(String[] args) {
        Ex4_v2 ex = new Ex4_v2();
        Scanner scanner = new Scanner(System.in);

        while (!hasNext) {
            stb = new StringBuilder(scanner.nextLine().trim());
            ex.getMath(ex.getFirst(), ex.getSecond());
            System.out.println("Хотите продолжить? : true/false");
            hasNext = scanner.hasNextBoolean();
        }

    }

    int getFirst() {
        StringBuilder strBLocal = new StringBuilder();
        for (int i = 0; i < stb.length(); i++) {
            switch (stb.charAt(i)) {
                case '0': case  '1': case '2': case '3':
                case '4': case  '5': case '6': case '7':
                case '8': case  '9':
                    strBLocal.append(stb.charAt(i));
                    break;
                default: if (strBLocal.length() > 0) {
                    value = Integer.decode(strBLocal.toString());
                    stb.delete(0, strBLocal.length());
                    System.out.println("Первый операнд " + strBLocal);
                    return value;
                }
            }
        }
        System.out.println("Некорректный ввод, попробуйте снова");
        return 0;
    }

    int getMath(int first, int second) {
        for (int i = 0; i < stb.length(); i++) {
            switch (stb.charAt(i)) {
                case '+':
                    System.out.println("Сумма равна: " + (first + second));
                    return first + second;
                case '-':
                    System.out.println("Разность  равна: " + (first - second));
                    return first - second;
                case '*':
                    System.out.println("умножение равно: " + (first * second));
                    return first * second;
                case  '/':
                    System.out.println("Деление равно: " + (first / second));
                    return first / second;
                default:
                    System.out.println("Введите корректную операцию / оперант не найден");
            }
        }
        System.out.println("Операция не найдена, попробуйте снова: ");
        return ' ';
    }

    int getSecond() {
        StringBuilder strBLocal = new StringBuilder();
        for (int i = 0; i < stb.length(); i++) {
            switch (stb.charAt(i)) {
                case '0': case  '1': case '2': case '3':
                case '4': case  '5': case '6': case '7':
                case '8': case  '9':
                    strBLocal.append(stb.charAt(i));
                default: if (strBLocal.length() > 0) {
                    value = Integer.decode(strBLocal.toString());
                    return Integer.decode(strBLocal.toString());
                }
            }
        }
        System.out.println("Некорректный ввод, попробуйте снова");
        return 0;
    }



}
