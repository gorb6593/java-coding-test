package org.example.exception.ex0;

public class NetworkServiceVO {

    public void sendMessage(String data) {
        String address = "http://example.com";
        NetworkClientVO clientVO = new NetworkClientVO(address);

        clientVO.connect();
        clientVO.send(data);
        clientVO.disconnect();
    }
}
