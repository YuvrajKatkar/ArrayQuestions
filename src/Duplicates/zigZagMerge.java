package Duplicates;

import java.util.Arrays;
import java.util.Scanner;

public class zigZagMerge {
    public static void optimizedZigZagMerge(int[] a,int []b){
        int max = Math.max(a.length,b.length);
        int index=0;
        int c[] = new int[a.length+b.length];
        for(int i =0;i<max;i++){
            if(i<a.length){
                c[index++]=a[i];
            }
            if(i<b.length){
                c[index++]=b[i];
            }
        }
        System.out.println(Arrays.toString(c));
    }
    public static void zigzag(int[] a, int[] b){
        int c[]=new int[a.length+b.length];
        int index =0; int min = Math.min(a.length, b.length);
        for(int i =0;i<min;i++){
            c[index++]=a[i];
            c[index++]=b[i];
        }
        index=0;
        for(int i = min*2;i<c.length;i++){
            if(a.length>=b.length){
                c[i]=a[min+ index++];
            }
            else {
                c[i]=b[min+ index++];
            }
        }
        System.out.println(Arrays.toString(c));
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
        zigzag(a,b);
        optimizedZigZagMerge(a,b);
    }
}
