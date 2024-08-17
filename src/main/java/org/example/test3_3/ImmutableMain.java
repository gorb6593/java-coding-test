package org.example.test3_3;

public class ImmutableMain {
    public static void main(String[] args) {

        ImmutableObj immutableObj = new ImmutableObj(10);
        ImmutableObj immutableObj2 = immutableObj.add(20);
        System.out.println("immutableObj = " + immutableObj.getValue());
        System.out.println("immutableObj2 = " + immutableObj2.getValue());
        String test1 = "1";
        String test2 = new String("1");
    }
}
