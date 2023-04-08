package Duplicates;

import java.util.Scanner;

public class mergeTwoArrays {
    public static void merge(int a[],int b[]){
        int c[] = new int[a.length+b.length];
        int index =0;
        for(int i=0;i<a.length;i++){
            c[index++]=a[i];
        }
        for(int i=0;i<b.length;i++){
            c[index++]=b[i];
        }
        for(int i =0;i<c.length;i++){
            System.out.println(c[i]+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of first array");
        int a[]=new int[sc.nextInt()];
        for(int i=0;i<a.length;i++){
            System.out.printf("Enter String in %d position of array",i);
            a[i]=sc.nextInt();
        }
        System.out.println("Enter size of second array");
        int b[]=new int[sc.nextInt()];
        for(int i=0;i<b.length;i++){
            System.out.printf("Enter String in %d position of array",i);
            b[i]=sc.nextInt();
        }
        merge(a,b);

    }
}
