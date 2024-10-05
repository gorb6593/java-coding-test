package org.example.generic.ex4;

import org.example.generic.animal.Animal;
import org.example.generic.animal.Cat;
import org.example.generic.animal.Dog;

public class MethodMain3 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 50);
        ComplexBox<Animal> animalComplexBox = new ComplexBox<>();
        animalComplexBox.setAnimal(dog);

        Cat cat1 = animalComplexBox.printAndReturn(cat);
        System.out.println("cat1 = " + cat1);
    }
}
