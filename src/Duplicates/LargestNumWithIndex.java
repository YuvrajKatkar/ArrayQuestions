package Duplicates;

import java.util.Scanner;

public class LargestNumWithIndex {
    public static void main(String[] args) {
        System.out.println("Enter numbers in array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
        }
        int max =a[0]; int index =0;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
                index =i;
            }
        }
        System.out.println(max);
        System.out.println(index);
    }
}
