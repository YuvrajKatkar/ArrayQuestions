package string.companyWise;

import java.util.Arrays;
import java.util.Scanner;

public class StringPermutation {
    public static boolean check(String a, String b){
        char []ch1 = a.toCharArray();
        char []ch2 = b.toCharArray();
        Arrays.sort(ch1);Arrays.sort(ch2);
        for(int i =0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String 1");
        String s = new Scanner(System.in).nextLine();
        System.out.println("ENter the String 2");
        String s1 = new Scanner(System.in).nextLine();
        //System.out.println(check(s)?"Is panagram":"Not panagram");
        System.out.println(check(s,s1)?"Yes":"No");
    }
}
