import java.util.Scanner;

public class StrongNumber {
    public static int factor(int num){
        int fact=1;
        for(int i=num;i>=1;i--){
            fact = fact*i;
        }
        return fact;
    }
    public static void isStrong(int num){
        int sum =0;int num1= num;
        while (num>0){
            sum += factor(num%10);
            num/=10;
        }
        if(sum==num1){
            System.out.println("Strong number: "+num1);
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
            isStrong(a[i]);
        }
    }
}
