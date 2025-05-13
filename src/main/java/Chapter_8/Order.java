package Chapter_8;

import java.util.Objects;

public class Order {
    private int id;
    private String status;
    private double price;

    public double priceCalc(){
        return 0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return id == order.id && Double.compare(price, order.price) == 0 && Objects.equals(status, order.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, price);
    }
}
