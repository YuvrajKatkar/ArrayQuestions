package arrays.level1;

import java.util.Arrays;

public class FindMissingInteger {
    public static int find(int a[]){
        int max = a.length+1;
        int sum1= max*(max+1)/2;
        int sum=0;
        for(int  i =0;i<a.length;i++){
            sum+=a[i];
        }
        return sum1-sum;
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 4, 6, 3, 7, 8};
        System.out.println(find(a));
    }
}
