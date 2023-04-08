package Duplicates;

import java.util.Scanner;

public class CountOfDuplicate {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[]= new int[size];
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the number to enter in array");
            a[i]=sc.nextInt();
        }
        int count=0;
        for(int i=0;i<a.length;i++) {
            if (a[i] !=0) {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        //System.out.println(a[i]);
                        count++;
                        a[j] = 0;
                    }
                }
            }
        }
        System.out.println("Number of duplicate numbers are:"+ count);
    }
}
