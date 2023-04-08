package string;

import java.util.Scanner;

public class ConvertCase {
    public static String changeCase(String a){
        char s1 = Character.toUpperCase(a.charAt(0));
        String s2 = a.substring(1);
        s2 = s2.toLowerCase();
        a = s1+s2;
        return a;
    }
    public static void convert(String s){
        String ch[] = s.split(" ");
        s="";
        for(int i =0;i<ch.length;i++){
            ch[i] = changeCase(ch[i]);
            s =  s + " " +ch[i];
        }
        System.out.println(s);
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        convert(s);
    }
}
