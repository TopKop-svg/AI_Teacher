package Chapter_8;

import java.util.List;

public class FoodOrder extends Order{
    private List<String> dishesList;

    @Override
    public double priceCalc() {
        return getPrice() * 1.1;
    }
}
