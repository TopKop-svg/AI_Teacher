package Patterns.Fabric_Pattern;

public class CoffeeFactory {
    public Coffee createCoffee(String type) {
        switch (type) {
            case "Late":
                return new Latte();
            case "Espresso":
                return new Espresso();
            default:
                new IllegalArgumentException();
        }
    }
}
