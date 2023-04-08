import java.util.Arrays;
import java.util.Scanner;

public class printLargestNumber {
    public static void printLargest(int []a){
        Arrays.sort(a);
        System.out.println(a[a.length-1]);
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int a[] = new int[sc.nextInt()];
        for(int i =0;i<a.length;i++){
            System.out.println("Enter number to enter in array");
            a[i]=sc.nextInt();
        }

        printLargest(a);
    }
}
