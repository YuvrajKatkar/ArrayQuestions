package Duplicates;

import java.util.Scanner;

public class FirstDuplicateChar {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        char a[]=new char[size];
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the Char to enter in array");
            a[i]=sc.next().charAt(0);
        }
        for(int i =0;i< a.length;i++){
            int count =1;

            if(a[i]!=0){
                for(int j=i+1;j<a.length;j++){
                    if(a[i]==a[j]) {
                        count++;
                        a[j] = 0;
                    }
                }
            }
            if(count!=1){
                System.out.println(a[i]);
                return;
            }
        }
    }

}
