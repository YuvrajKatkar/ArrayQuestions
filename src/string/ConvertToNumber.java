package string;

import java.util.Scanner;

public class ConvertToNumber {
    public static void check(String a){
        int b= Integer.parseInt(a);
        System.out.println(b);
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        check(s);
    }
}
