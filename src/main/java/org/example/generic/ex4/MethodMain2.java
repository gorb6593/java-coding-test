package org.example.generic.ex4;

import org.example.generic.animal.Cat;
import org.example.generic.animal.Dog;

public class MethodMain2 {

    public static void main(String[] args) {
        Dog dog = new Dog("멍멍이", 100);
        Cat cat = new Cat("냐옹이", 150);

        AnimalMethod.checkup(dog);
        AnimalMethod.checkup(cat);

        Dog dog1 = new Dog("큰 개", 200);

        Dog bigger = AnimalMethod.bigger(dog1, dog);
        System.out.println("bigger = " + bigger);
    }
}
