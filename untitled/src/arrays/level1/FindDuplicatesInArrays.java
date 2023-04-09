package arrays.level1;

import java.util.HashSet;

public class FindDuplicatesInArrays {
    public static void find(int a[]){
        HashSet hs = new HashSet();
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                if(a[j]==a[i]){
                    hs.add(a[i]);
                }
            }
        }
        System.out.println(hs);
    }
    public static void main(String[] args) {
        int a[] = {1, 2, 3, 6, 3, 6, 1};
        find(a);
    }
}
