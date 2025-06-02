package Task24_05_2025;

public class Main {
    public static void main(String[] args) {
        final int OBJECTS = 20_000_000;
        long start = System.currentTimeMillis();
        for (int i = 0; i < OBJECTS; i++) {
            Object obj = new Object();
        }
        long mid = System.currentTimeMillis();
        System.gc();
        long end = System.currentTimeMillis();
        System.out.printf("Создано %d объектов.\n", OBJECTS);
        System.out.printf("Время создания: %d ms\n", (mid - start));
        System.out.printf("Время после GC: %d ms\n", (end - mid));
    }
}
