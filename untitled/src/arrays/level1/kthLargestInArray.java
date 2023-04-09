package arrays.level1;

public class kthLargestInArray {
    public static void findkthMinimum(int[]a,int key){
        int index=0; int ans =0;
        for(int j = 0;j<key;j++) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] < min ) {
                    min = a[i];
                    index=i;
                }
            }
            ans = a[index];
            a[index]=Integer.MAX_VALUE;
            //System.out.println(ans);
        }
        System.out.println(ans);
    }
    public static void findkthLargest(int []a,int key){
        int index=0;int ans =0;
        for(int j=0;j<key;j++) {
            int max = Integer.MIN_VALUE;
            for (int i = 0; i < a.length; i++) {
                if (a[i] > max) {
                    max = a[i];
                    index = i;

                }
            }
            ans= a[index];
            a[index]=Integer.MIN_VALUE;
        }
        System.out.println(ans);
    }
    public static void main(String[] args) {
        int a[] = {10, 20, 15, 2, 23, 90, 67};
        findkthLargest(a,2);
    }
}
