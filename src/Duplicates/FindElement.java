package Duplicates;

import java.util.Scanner;

public class FindElement {
    public static void findElement(String[]a, String key){
        for(int i =0;i<a.length;i++){
            if(key.equals(a[i])){
                System.out.println("Element is found");
                return;
            }
        }
        System.out.println("Element is not found");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array");
        String a[]=new String[sc.nextInt()];
        for(int i=0;i<a.length;i++){
            System.out.printf("Enter String in %d position of array",i);
            a[i]=sc.next();
        }
        System.out.println("Enter key/elemnt you want to find");
        String key = sc.next();
        findElement(a,key);
    }
}
