package string;

import java.util.Scanner;

public class SumOfDigitsInString {
    public static int check(String a){
        int sum=0;
        for(int i=0;i<a.length();i++){
            //49 is asci value of 1
            sum += (a.charAt(i))-48;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        System.out.println(check(s));
    }
}
