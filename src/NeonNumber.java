import java.util.Scanner;

public class NeonNumber {
    public static void isNeon(int num){
        int sq = num*num; int num1 = num;int sum =0;
        while (num>0){
            sum+=sq%10;
            num/=10;
        }
        System.out.println("Neon number is :"+num1);
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
            isNeon(a[i]);
        }
    }
}
