package arrays.level1;

import java.util.Arrays;

public class Sort012 {
    public static void sort(int a[]){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    for(int k = j;k>i;k--){
                        int tem= a[k];
                        a[k]=a[k-1];
                        a[k-1]=tem;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 15, 2, 23, 90, 67};
        int b[]={0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        sort(b);
    }
}
