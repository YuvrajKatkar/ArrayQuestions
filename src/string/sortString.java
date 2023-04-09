package string;

import java.util.Arrays;
import java.util.Scanner;

public class sortString {
    public static String sort(String a){
        char[] ch = a.toCharArray();
        Arrays.sort(ch); String ans="";
        ans += ch[0];
        for(int i =1;i<ch.length;i++){
            ans =ans+ch[i];
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(sort(s));
    }
}
