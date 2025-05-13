package Chapter_8;

import java.util.List;

public class DrinkOrder extends Order {
    private List<String> drinkList;

    @Override
    public double priceCalc() {
        return getPrice() * 1.05;
    }
}
