import java.util.Scanner;

public class XylemPholem {
    public static void check(int num) {
        int sum1 = num%10;int sum2=0;int num1=num;
        num/=10;
        while(num>9) {
            sum2 +=num%10;
            num/=10;
        }
        sum1+=num;
        if(sum1==sum2) {
            System.out.println("Xylem"+num1);
        }
        else {
            System.out.println("Pholem"+num1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a[] = new int[sc.nextInt()];
        for(int i =0;i<a.length;i++){
            System.out.println("Enter number to enter in array");
            a[i]=sc.nextInt();
        }
        for(int i =0;i<a.length;i++){
            check(a[i]);
        }
    }
}
