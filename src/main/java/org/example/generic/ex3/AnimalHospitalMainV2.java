package org.example.generic.ex3;

import org.example.generic.animal.Cat;
import org.example.generic.animal.Dog;

public class AnimalHospitalMainV2 {
    public static void main(String[] args) {
        AnimalHospitalV2<Dog> dogHospital = new AnimalHospitalV2();
        AnimalHospitalV2<Cat> catHospital = new AnimalHospitalV2();

        Dog dog = new Dog("멍멍이1", 100);
        Cat cat = new Cat("냐옹이1", 300);

        dogHospital.setAnimal(dog);
        dogHospital.checkup();

        catHospital.setAnimal(cat);
        catHospital.checkup();

        //문제1 : 개 병원에 고양이 전달
        dogHospital.setAnimal(dog); // 매개변수 체크 실패: 컴파일 오류가 발생하지 않음

        //문제2 : 개 타입 반환
        dogHospital.setAnimal(dog);
        Dog biggerDog = dogHospital.bigger(new Dog("멍멍이2", 200));
        System.out.println("biggerDog = " + biggerDog);

    }
}
