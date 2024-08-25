package org.example.generic.ex3;

import org.example.generic.animal.Dog;

public class DogHospital {

    private Dog animal;

    public void setAnimal(Dog animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 크기 : " + animal.getSize());
        System.out.println("동물 이름 : " + animal.getName());
        animal.sound();
    }

    public Dog bigger(Dog target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
