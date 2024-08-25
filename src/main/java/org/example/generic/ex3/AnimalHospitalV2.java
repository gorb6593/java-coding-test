package org.example.generic.ex3;

import org.example.generic.animal.Animal;

public class AnimalHospitalV2<T extends Animal> {
    private T animal;

    public void setAnimal(T animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 크기 : " + animal.getSize());
        System.out.println("동물 이름 : " + animal.getName());
        animal.sound();
    }

    public T bigger(T target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
