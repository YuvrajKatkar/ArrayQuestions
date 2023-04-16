package Sorting;

import java.util.Arrays;

public class bubbleSort {
    public static int[] sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length-i;j++){
                if(a[j-1]>a[j]){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                    System.out.println(Arrays.toString((a)));
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={45,12,32,65,878,94,21,4,2};
        System.out.println(Arrays.toString(sort(a)));
    }

}
