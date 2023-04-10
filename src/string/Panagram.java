package string;

import java.util.Arrays;
import java.util.Scanner;

public class Panagram {
    public static boolean check(String a){
        a=a.toUpperCase();
        boolean visted[]=new boolean[26];
        for(int j =0;j<a.length() ;j++){
            if(a.charAt(j)!=' ' && a.charAt(j)>='A'&& a.charAt(j)<='Z') {
//                System.out.println(a.charAt(j));
                //System.out.println((int) a.charAt(j) - 65);
                visted[(int) a.charAt(j) - 65] = true;
            }
        }
        //System.out.println(Arrays.toString(visted));
        for(int i=0;i<visted.length;i++){
            if(!visted[i]){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(check(s)?"Is panagram":"Not panagram");
    }
}
