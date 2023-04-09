package string;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class DuplicateCharInString {
    public static void duplicate(String a){
        HashSet hs = new HashSet();
        for(int i=0;i<a.length();i++){
            for(int j=i+1;j<a.length();j++){
                if(a.charAt(i)==a.charAt(j) && a.charAt(j)!=' ' ){
                   hs.add(a.charAt(i));
                }
            }
        }
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println("Duplicate chars: "+it.next());
        }
    }
    public static void main(String[] args) {
        System.out.println("ENter the String");
        String s = new Scanner(System.in).nextLine();
        duplicate(s);
    }
}
