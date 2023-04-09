package string;

import java.util.Scanner;

public class ASCIIValue {
    public static void value(String a){
        for(int i =0;i<a.length();i++){
            System.out.println(a.charAt(i)+": "+(int)a.charAt(i));
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        value(s);
    }
}
