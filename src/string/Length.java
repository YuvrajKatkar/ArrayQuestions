package string;

import java.util.Scanner;

public class Length {
    public static void count(String a){
        String[] s1 = a.split(" ");
        for(int i =0;i<s1.length;i++){
            System.out.println(s1[i] + "-" +s1[i].length() );
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        count(s);
    }
}
