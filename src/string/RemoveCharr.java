package string;

import java.util.Scanner;

public class RemoveCharr {
    public static String remove(String a,String b){
        String ans=a;
        for(int i=0;i<b.length();i++){
            for(int j =0;j<ans.length()-1;j++){
                if(b.charAt(i)==ans.charAt(j)){
                    ans = ans.substring(0,j)+ans.substring(j+1);
                    System.out.println(ans);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println("ENter the String 2");
        String s2 = new Scanner(System.in).nextLine();
        System.out.println(remove(s,s2));
    }
}
