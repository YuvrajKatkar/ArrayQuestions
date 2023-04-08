package Duplicates;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void sort(char a[]){
        for(int i =0;i<a.length;i++){
            for( int j =i+1;j<a.length;j++){
                if(a[i]>a[j]){
                    char temp= a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        char a[] = new char[sc.nextInt()];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Enter String in %d position of array", i);
            a[i] = sc.next().charAt(0);
        }
        sort(a);
    }
}
