package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static int[] sort(int[]a){



        for(int i=0;i<a.length;i++){
            int maxIndex = 0;int last = a.length-1;
            for(int j=1;j<a.length-i;j++){
                //maxIndex = 0;
                if(a[j]>a[maxIndex]){
                    maxIndex = j;
                }
            }
            System.out.println(a[maxIndex]);
            int temp = a[maxIndex];
            a[maxIndex]=a[last-i];
            a[last-i] = temp;

        }
        return a;
    }
    public static void main(String[] args) {
        int a[]={45,12,32,65,878,94,21,4};
        System.out.println(Arrays.toString(sort(a)));
    }
}
