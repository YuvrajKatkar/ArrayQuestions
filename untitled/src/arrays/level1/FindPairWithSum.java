package arrays.level1;

public class FindPairWithSum {
    public static void find(int a[],int key ){
        for(int i =0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
                if(a[i]+a[j]==key) {
                    System.out.println("("+a[i]+","+a[j]+")");
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 5, 7, -1, 5};
        find(a,6);
    }
}
