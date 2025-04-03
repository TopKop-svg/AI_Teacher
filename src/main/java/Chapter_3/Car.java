package Chapter_3;

public class Car {
    String brand;
    double speed, maxSpeed;

    public Car(String brand, double maxSpeed) {
        if (brand != null && maxSpeed > 0) {
            this.brand = brand;
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Передаваемые параметры" +
                    " не могут быть применимы");
        }
    }

    public void accelerate(double amount) {
        if (maxSpeed > speed + amount) {
            speed = speed + amount;
        } else {
            throw new IllegalArgumentException("Передаваемая скорость не достижима");
        }
    }

    public void brake(double amount) {
        if (speed - amount > 0) {
            speed = speed - amount;
        } else {
            throw new IllegalArgumentException("Передаваемая скорость не достижима");
        }
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand != null) {
            this.brand = brand;
        } else {
            throw new IllegalArgumentException("Передаваемые параметры" +
                    " не могут быть применимы");
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        if ( speed > 0) {
            this.speed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Передаваемые параметры" +
                    " не могут быть применимы");
        }
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        if ( maxSpeed > 0) {
            this.maxSpeed = maxSpeed;
        } else {
            throw new IllegalArgumentException("Передаваемые параметры" +
                    " не могут быть применимы");
        }
    }
}
