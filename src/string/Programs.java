package string;

import java.util.Locale;
import java.util.Scanner;

public class Programs {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1 = "qpieurmcnvmnoity ";
        String s2 = "hello".toUpperCase();
        String s3 = "hello".toUpperCase();
        String s4 = s2;
        System.out.println(new String("HELLO")=="HELLO");
        System.out.println(new String("HELLO").equals("HELLO"));
        System.out.println(s2==s3);
        System.out.println(s2.equals(s3));
        System.out.println(s2==s4);
        System.out.println(s2);
        char[] ch = s1.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(ch[i]=='a' ||ch[i]=='e' ||ch[i]=='i' ||ch[i]=='o' ||ch[i]=='u' ||ch[i]=='A' ||ch[i]=='E' ||ch[i]=='I' ||ch[i]=='O' ||ch[i]=='U'){
                System.out.println(ch[i]);
            }
        }
    }
}
