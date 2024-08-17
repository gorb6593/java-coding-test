package org.example.test3_3;

public class MutableMain {
    public static void main(String[] args) {

        MutableObj obj = new MutableObj(10);
        obj.add(20);
        System.out.println("obj = " + obj.getValue());
    }
}
