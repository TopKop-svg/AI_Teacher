package Chapter_5;

public class Main5 {
    public static void main(String[] args) {
        Animal cat1 = new Cat("Barsic", 3);
        Animal dog1 = new Dog("Sharik", 5, "Shibu");

        System.out.println(cat1.toString());
        System.out.println("-------------------------------");
        System.out.println(dog1.toString());
    }
}
