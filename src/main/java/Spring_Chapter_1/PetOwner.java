package Spring_Chapter_1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class PetOwner {
    private Animal animal;

    @Autowired
    public PetOwner(Animal animal) {
        this.animal = animal;
    }

    public void petSound() {
        animal.makeSound();
    }
}
