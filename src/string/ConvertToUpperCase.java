package string;

import java.util.Scanner;

public class ConvertToUpperCase {
    public static String convert(String a){
        a=a.toUpperCase();
        return a;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(convert(s));
    }
}
