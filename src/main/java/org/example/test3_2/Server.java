package org.example.test3_2;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {
//        try {
//            System.out.println("Waiting for client");
//            ServerSocket ss = new ServerSocket(9800);
//            Socket soc = ss.accept();
//            System.out.println("Connection established");
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        ServerSocket ss = new ServerSocket();

        Socket soc = ss.accept();

        BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));

        PrintWriter out = new PrintWriter(soc.getOutputStream(), true);

    }
}
