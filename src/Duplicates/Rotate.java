package Duplicates;

import java.util.Arrays;

public class Rotate {
    public static int[] leftRotate(int[] a){
        int temp1=a[0];
        for(int i = 1;i<a.length;i++){
            int temp = a[i];
            a[i-1]=temp;

        }
        a[a.length-1]=temp1;
        return a;
    }

    public static void main(String[] args) {
        int a[] = {4,7,5,6,2,3};
        System.out.println(Arrays.toString(leftRotate(a)));
    }
}
