package Chapter_9;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StreamTasks.uniqueSquares(List.of(1, 2, 3, 2)).forEach(System.out::println);
    }
}
