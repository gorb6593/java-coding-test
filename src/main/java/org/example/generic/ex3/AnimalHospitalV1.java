package org.example.generic.ex3;

import org.example.generic.animal.Animal;

public class AnimalHospitalV1 {
    private Animal animal;

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 크기 : " + animal.getSize());
        System.out.println("동물 이름 : " + animal.getName());
        animal.sound();
    }

    public Animal bigger(Animal target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
