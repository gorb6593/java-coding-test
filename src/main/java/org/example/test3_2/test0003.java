package org.example.test3_2;

public class test0003 {
    static long startTime = 0;

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
        threadTest.start(); // ......

        startTime = System.currentTimeMillis();
        for (int i = 0; i < 100; i++) {
            System.out.print("-");
        }
        System.out.println("소요시간1:" + (System.currentTimeMillis() - test0003.startTime));
    }
}
//|||||||
class ThreadTest extends Thread {
    public void run() {
        //
        for (int i = 0; i < 100; i++) {
            System.out.print("|");
        }
        System.out.println("소요시간2:" + (System.currentTimeMillis() - test0003.startTime));
    }
}
