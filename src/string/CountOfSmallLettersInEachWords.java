package string;

import java.util.Scanner;

public class CountOfSmallLettersInEachWords {
    public static int countOfSmall(String a){
        int count=0;
        for(int i =0;i<a.length();i++)
            if(Character.isLowerCase(a.charAt(i))){
                count++;
            }
        return count;
    }
    public static void count(String a){
        String ch[] = a.split(" ");
        for(int i = 0;i<ch.length;i++){
            System.out.println(ch[i]+"-"+countOfSmall(ch[i]));
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        count(s);
    }
}
