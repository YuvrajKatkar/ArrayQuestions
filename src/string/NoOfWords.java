package string;

import java.util.Arrays;
import java.util.Scanner;

public class NoOfWords {
    public static void count(String s){
        String ch[] = s.split(" ");
        System.out.println(ch.length);
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        count(s);
    }
}
