package org.example.exception.ex0;

import java.util.Scanner;

public class MainVO {

    public static void main(String[] args) {
        NetworkServiceVO networkService = new NetworkServiceVO();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("전송할 문자 : ");
            String input = scanner.nextLine();
            if (input.equals("text")) {
                break;
            }
            networkService.sendMessage(input);
            System.out.println();
        }
        System.out.println("프로그램 종료");
    }
}
