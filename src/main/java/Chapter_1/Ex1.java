package Chapter_1;

public class Ex1 {
    public int getSum(int first, int second) {
        return first + second;
    }

    public int getSum(int first, int second, int third) {
        return first + second + third;
    }
    public static void main(String[] args) {
        Ex1 ex1 = new Ex1();
        ex1.getSum(1, 2);
        ex1.getSum(1, 2, 3);
    }
}
