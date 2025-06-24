package Patterns.Fabric_Pattern;

public class Espresso implements Coffee {
    public String getName() {
        return "Espresso";
    }

    @Override
    public String getDescription() {
        return "Кофе эспрессо содержит сахар, если вам нужна бодрость то вы по адресу";
    }

    @Override
    public double getCost() {
        return 125.0;
    }
}
