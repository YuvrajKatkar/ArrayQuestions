package string.companyWise;

import java.util.Scanner;

public class RemoveDuplicate {
    public static String retu(String a){
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j) && a.charAt(j)!=' ' ){
                    a = a.substring(0,j)+a.substring(j+1);
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        //System.out.println(check(s)?"Is panagram":"Not panagram");
        System.out.println(retu(s));
    }
}
