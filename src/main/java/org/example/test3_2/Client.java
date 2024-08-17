package org.example.test3_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws Exception{
        Socket soc = new Socket("localhost", 9806 );

        BufferedReader userInput = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
    }
}
