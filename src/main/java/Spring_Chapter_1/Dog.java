package Spring_Chapter_1;

public class Dog implements Animal{
    @Override
    public void makeSound() {
        System.out.println( "Woof!");
    }
}
