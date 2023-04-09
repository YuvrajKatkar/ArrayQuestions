package arrays.level1;

import java.util.Arrays;

public class NegativeToLeft {
    public static int[] sort(int[] a){
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                for(int j=i;j>count;j--){
                    int temp = a[j];
                    a[j]=a[j-1];
                    a[j-1]=temp;
                }
                count++;
            }
        }
        return a;
    }
    public static void main(String[] args) {
        int a[] = {1, 4, 0, 0, -3, 10,-5};
        System.out.println(Arrays.toString(sort(a)));
    }
}
