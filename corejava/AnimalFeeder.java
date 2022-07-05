package corejava;

import java.util.List;

public class AnimalFeeder {
    public void feed(List<Animal> animals) {
        animals.forEach(animal -> {
            animal.sound();
            /*We often use instanceof operator before
            downcasting to check if the object belongs to the specific type: */
            if (animal instanceof Dog) {
                ((Dog) animal).bark();
            }
        });
    }
}
