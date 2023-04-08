package string;

import java.util.Scanner;

public class RemoveBlankSpaces {
    public static String remove(String a){
        String ans="";
        ans  = a.replaceAll("[ ]","");
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(remove(s));
    }
}
