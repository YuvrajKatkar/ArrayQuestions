package string;

import java.util.Scanner;

public class ReverseString {
    public static String reverse(String a){
        String ans ="";
        for(int i =a.length()-1;i>=0;i--){
            ans += a.charAt(i);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(reverse(s));
    }
}
