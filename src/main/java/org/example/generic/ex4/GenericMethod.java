package org.example.generic.ex4;

public class GenericMethod {

    public static Object objMethod(Object obj) {
        System.out.println("obj = " + obj);
        return obj;
    }

    public static <T> T genericMethod(T obj) {
        System.out.println("obj = " + obj);
        return obj;
    }
    public static <T extends Number> T numberMethod(T obj) {
        System.out.println("bound = " + obj);
        return obj;
    }
}
