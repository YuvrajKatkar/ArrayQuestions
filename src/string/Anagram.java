package string;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static boolean  check(String a,String b){
        if(a.length()!=b.length())return false;
        char[] ch1 = a.toCharArray();
        char[] ch2 = b.toCharArray();
        Arrays.sort(ch1);Arrays.sort(ch2);
        for(int i =0;i<ch1.length;i++){
            if(Character.isLowerCase(ch1[i])!=Character.isLowerCase(ch2[i]))return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String a="peek";String b = "keep";
        //String s = new Scanner(System.in).nextLine();
        System.out.println(check(a,b));
    }
}
