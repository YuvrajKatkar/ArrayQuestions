package arrays.level1;

public class SubArraySum {
    public static void findSubArray(int a[], int sum){
        for(int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length;j++){
                int sum1=0;
                for(int k=i;k<=j;k++){
                    sum1+=a[k];
                    if(sum==sum1){
                        System.out.println("Between index "+i+" and "+j);
                        return;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int a[] = {1, 4, 0, 0, 3, 10, 5};
        findSubArray(a,7);
    }
}
