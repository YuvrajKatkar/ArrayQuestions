package string;

import java.util.Scanner;

public class Count {
    public static void count(String s){
        int countVowel=0;int countConsonants=0,countSpecialChar=0,countDigits=0,countCapital=0,countSmall=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U'){
                countVowel++;
            }
            else if(s.charAt(i)!='a' && s.charAt(i)!='e' && s.charAt(i)!='i' && s.charAt(i)!='o' && s.charAt(i)!='u' && s.charAt(i)!='A' &&s.charAt(i)!='E' && s.charAt(i)!='I'&&s.charAt(i)!='O'&&s.charAt(i)!='U' && ((s.charAt(i)>='A'&&s.charAt(i)<='Z')||(s.charAt(i)>='a'&&s.charAt(i)<='z'))){
                System.out.println(s.charAt(i));
                countConsonants++;
            }
            else if(s.charAt(i)>=0 && s.charAt(i)<=48 && s.charAt(i)!=' ' &&s.charAt(i)>=58 &&s.charAt(i)<=64){
                countSpecialChar++;
            }
            if(Character.isDigit(s.charAt(i))){
                countDigits++;
            }
            if(Character.isLowerCase(s.charAt(i))){
                countSmall++;
            }
            if(Character.isUpperCase(s.charAt(i))){
                countCapital++;
            }
        }
        System.out.println("Count of Vowels: "+countVowel);
        System.out.println("Count of Consonants: "+countConsonants);
        System.out.println("Count of Digits: "+countDigits);
        System.out.println("Count of Capital case: "+countCapital);
        System.out.println("Count of Lower case: "+countSmall);
        System.out.println("Count of Special char: "+countSpecialChar);


    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
     String s = new Scanner(System.in).nextLine();
     count(s);
    }
}
