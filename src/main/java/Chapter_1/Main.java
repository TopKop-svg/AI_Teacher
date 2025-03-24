package Chapter_1;

import java.util.Scanner;

public class Main {
    static int point = 0;
    static boolean dontExit = true;
    public static void main(String[] args) {
        Main m = new Main();
        Scanner scanner = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Введите данные для вычислений в одну строку через пробел");
        sb.append(scanner.next());

        while (dontExit) {
            m.getFirstNumberFromScanner(sb);
            sb = new StringBuilder();
            sb.append(scanner.next());
        }
        //System.out.println(m.getFirstNumberFromScanner(sb));

    }

    Integer getFirstNumberFromScanner(StringBuilder strB) {
        StringBuilder strBLocal = new StringBuilder();
        for (int i = 0; i < strB.length(); i++) {
            switch (strB.charAt(i)) {
                case '0': case  '1': case '2': case '3':
                case '4': case  '5': case '6': case '7':
                case '8': case  '9':
                    strBLocal.append(strB.charAt(i));
                    break;
                default:

                    System.out.println("Введите корректные данные!");
                    return 0;

            }
        }

        return Integer.decode(strBLocal.toString());
    }

    int getResultAfterOperation(String str) {

        return 0;
    }

   /* char getOperator(int val1, int val2, StringBuilder strB) {
        for (int i = 0; i < strB.length(); i++) {
            switch (strB.charAt(i)) {
                case '+' :
                    System.out.println("Операция сложения " + strB.charAt(i));
                    break;
                case '-':
                    System.out.println("Операция вычитания " + strB.charAt(i));
                    break;
                case '*':
                    System.out.println("Операция умножения " + strB.charAt(i));
                    break;
                case '/':
                    System.out.println("Операция деления " + strB.charAt(i));
                    break;
                default:
                    System.out.println("Введите корректную операцию / оперант не найден");
            }
        }
        return 'a';
    }*/
}
