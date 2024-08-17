package org.example.test3_2;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Base64;

public class tset0001 {
  public static void main(String[] args) throws UnsupportedEncodingException {
    String number = "8604261860815";

    String encodeNm = Base64.getEncoder().encodeToString(number.getBytes());
    System.out.println("encodeNm = " + encodeNm);

    String encodedStr = "ODYwNDI2MTg2MDgxNQ==";
    byte[] decodedBytes = Base64.getDecoder().decode(encodedStr);
    String decodedStr = new String(decodedBytes);

    System.out.println("decoded string: " + decodedStr);



  }
}
