import java.util.Scanner;

public class ArmstrongNumber {
    public static int count(int num){
        int count=0;
        while(num>0){
            count++;
            num/=10;
        }
        return count;
    }
    public static int power(int num, int expo){
        int power=1;
        for(int i=1;i<=expo;i++){
            power*=num;
        }
        return power;
    }
    public static void isArmstrong(int num){
        int sum =0;int count = count(num);int num1 = num;
        while(num>0){
            sum += power(num%10,count);
            num/=10;
        }

        if(sum==num1){
            System.out.println("Armstrong number:"+sum);
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
            isArmstrong(a[i]);
        }
    }
}
