package org.example.exception.ex1;


public class NetworkServiceV1 {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientV1 clientV1 = new NetworkClientV1(address);
        clientV1.initError(data);

        clientV1.connect();
        clientV1.send(data);
        clientV1.disconnect();
    }
}
