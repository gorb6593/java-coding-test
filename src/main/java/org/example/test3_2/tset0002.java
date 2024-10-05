//package org.example.test3_2;
//
//import com.google.auth.oauth2.GoogleCredentials;
//import com.google.firebase.FirebaseApp;
//import com.google.firebase.FirebaseOptions;
//
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.util.*;
//
//public class tset0002 {
//  private static final String SCOPES = "https://www.googleapis.com/auth/firebase.messaging";
//
//  private static String getAccessToken() throws IOException {
//    GoogleCredentials googleCredentials = GoogleCredentials
//            .fromStream(new FileInputStream("/Users/readnumber/Downloads/refreshToken.json"))
//            .createScoped(Arrays.asList(SCOPES));
//    googleCredentials.refreshAccessToken();
//    System.out.println("googleCredentials = " + googleCredentials);
//    return googleCredentials.getAccessToken().getTokenValue();
//  }
//
//
//  public static void main(String[] args) throws IOException {
//    System.out.println("시작!!!");
//
////    System.out.println("refreshToken = " + refreshToken);
////    FirebaseOptions options = FirebaseOptions.builder()
////            .setCredentials(GoogleCredentials.fromStream(refreshToken))
////            .setDatabaseUrl("https://readnumber-b0d71.firebaseio.com")
////            .build();
////
////    FirebaseApp firebaseApp = FirebaseApp.initializeApp(options);
//    System.out.println(" 232= " + getAccessToken());
//
//
//  }
//
//
//}
