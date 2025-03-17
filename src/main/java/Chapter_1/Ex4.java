package Chapter_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> arrList = new ArrayList<>();
        System.out.println("Введите первое число");
        arrList.add(scanner.next());
        System.out.println("Введите операцию");
        arrList.add(scanner.next());
        System.out.println("Введите второе число");
        arrList.add(scanner.next());
        arrList.



    }

    public void getOperation() {
        switch (operantion) {
            case "*":
                result = val1 * val2;
                break;
            case "-":
                result = val1 - val2;
                break;
            case "+":
                result = val1 + val2;
                break;
            case "/":
                result = val1 / val2;
                break;
            default:
                System.out.println("Введите корректную операцию!");
        }
    }

    class Numb {
        void setFirstNumb(String firstNumb) {

        }
    }


}
