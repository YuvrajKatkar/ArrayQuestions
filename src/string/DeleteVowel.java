package string;

import java.util.Scanner;

public class DeleteVowel {
    public static String remove(String a){
        a=a.replaceAll("[aeiouAEIOU]","");
        return a;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(remove(s));
    }
}
