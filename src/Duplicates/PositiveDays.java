package Duplicates;

import java.util.Scanner;

public class PositiveDays {
    public static void main(String[] args) {
        System.out.println("Enter no of days sales are to be entered");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int count =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                count++;
            }
        }
        System.out.println(count);
    }
}
