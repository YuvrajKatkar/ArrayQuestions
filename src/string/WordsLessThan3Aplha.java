package string;

import java.util.Scanner;

public class WordsLessThan3Aplha {
    public static void find(String a){
        String ch[] = a.split(" ");
        for(int i=0;i<ch.length;i++){
            if(ch[i].length()<4){
                System.out.println(ch[i]);
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        find(s);
    }
}
