package string;

import java.util.Scanner;

public class FindLastTwoWordsOfString {
    public static String obtain(String a){
        String ans="";
        String ch[]=a.split(" ");
        ans = ch[ch.length-2] + " "+ch[ch.length-1];
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(obtain(s));
    }
}
