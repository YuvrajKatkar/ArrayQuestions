package string;

import java.util.Scanner;

public class LongestWordInString {
    public static String find(String a){
        String s[] = a.split(" ");
        int max=0;int index =0;
        for(int i=0;i<s.length;i++){
            if(s[i].length()>max){
                max = s[i].length();
                index=i;
            }
        }

        return s[index];
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(find(s));
    }
}
