package Patterns.Fabric_Pattern;

public class Latte implements Coffee {
    public String getName() {
        return "Latte";
    }

    @Override
    public String getDescription() {
        return "Кофе латте, доержит молоко и сахар, подходит для легкой бодрости";
    }

    @Override
    public double getCost() {
        return 155.43;
    }
}
