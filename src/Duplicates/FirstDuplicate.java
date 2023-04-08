package Duplicates;

import java.util.Scanner;

public class FirstDuplicate {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int a[]=new int[size];
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the number to enter in array");
            a[i]=sc.nextInt();
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
