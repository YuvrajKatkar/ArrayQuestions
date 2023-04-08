package string;

import java.util.Scanner;

public class OccurrenceOfChar {
    public static void check(String a){
        int aplha[] = new int[26];
        a=a.toUpperCase();
        for(int i=0;i<a.length();i++){
            aplha[a.charAt(i)-65]++;
        }
        for(int i =0;i<aplha.length;i++){
            if(aplha[i]!=0) {
                System.out.println((char) (i + 97) + " :" + aplha[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        check(s);
    }
}
