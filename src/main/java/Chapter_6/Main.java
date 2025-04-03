package Chapter_6;

public class Main {
    public static void main(String[] args) {
        Printable[] print = new Printable[] {
                new Book("Spring Framework", "Jhoshua Blokh", 2019),
        new Magazine("Automechanick", 12)};

        for (int i = 0; i < print.length; i++) {
            print[i].printInfo();
        }
    }
}
