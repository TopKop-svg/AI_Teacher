package Chapter_3;

public class Main {
    public static void main(String[] args) {
        try {
            Car car = new Car("audi", 220);
            car.setSpeed(20);
            System.out.println("Скорость автомобиля: " + car.getSpeed());
            car.accelerate(60);
            System.out.println("Скорость автомобиля: " + car.getSpeed());
            car.brake(40);
            System.out.println("Скорость автомобиля: " + car.getSpeed());
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }
}
