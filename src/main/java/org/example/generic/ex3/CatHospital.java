package org.example.generic.ex3;

import org.example.generic.animal.Cat;

public class CatHospital {

    private Cat animal;

    public void setAnimal(Cat animal) {
        this.animal = animal;
    }

    public void checkup() {
        System.out.println("동물 크기 : " + animal.getSize());
        System.out.println("동물 이름 : " + animal.getName());
        animal.sound();
    }

    public Cat bigger(Cat target) {
        return animal.getSize() > target.getSize() ? animal : target;
    }
}
