import java.util.Scanner;

public class BouncyNumber {
    public static void  check(int num) {
        int plus = 0;
        int minus = 0;int num1 = num;
        while (num > 10) {
            int rem1 = num % 10;
            int rem2 = (num / 10) % 10;

            if (rem1 > rem2) {
                plus++;
            } else {
                minus++;
            }

            num /= 10;

        }
        if (plus > 0 && minus > 0) {
            System.out.println("Bouncy number: " + num1);
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
