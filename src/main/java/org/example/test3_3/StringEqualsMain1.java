package org.example.test3_3;

public class StringEqualsMain1 {
    public static void main(String[] args) {
        String str1 = new String("helle");
        String str2 = new String("helle");
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        String str3 = "hello";
        String str4 = "hello";
        System.out.println("(str3 == str4) = " + (str3 == str4));
        System.out.println("(str3.equals(str4)) = " + (str3.equals(str4)));
    }
}
