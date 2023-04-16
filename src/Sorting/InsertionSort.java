package Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static int[] sort(int a[]){
        for(int i = 0;i<a.length;i++){
            for(int j = i+1;j>0;j--){
                if(a[j]<a[j-1]){
                    int tem = a[j];
                    a[j]=a[j-1];
                    a[j-1]=tem;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={45,12,32,65,878,94,21,4};
        System.out.println(Arrays.toString(sort(a)));
    }
}
