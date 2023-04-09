package arrays.level1;

import java.util.Arrays;

public class CyclicRotateArray {
    public static int[] rotate(int a[]){
        int first = a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=first;
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1, 4, 0, 0, -3, 10,-5};
        System.out.println(Arrays.toString(rotate(a)));
    }
}
