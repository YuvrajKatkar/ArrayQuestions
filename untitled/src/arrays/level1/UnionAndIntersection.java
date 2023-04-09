package arrays.level1;

import java.util.Arrays;

public class UnionAndIntersection {
    public static void find(int a[], int b[]){
        int merge[]=new int[a.length+b.length];int index=0;
        int max = Math.max(a.length,b.length);
        int intersection[] = new int[max];
        int union[] = new int[a.length+b.length];
        for(int i=0;i<a.length;i++){
            merge[index++]=a[i];
        }
        for(int i=0;i< b.length;i++){
            merge[index++]=b[i];
        }
        Arrays.sort(merge);
        System.out.println(Arrays.toString(merge));


    }
    public static void main(String[] args) {
        int arr1[] = { 1, 2, 2, 2, 3 };
        int arr2[] = { 2, 3, 4, 5 };

        find(arr1, arr2);
    }
}
