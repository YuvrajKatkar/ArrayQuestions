import java.util.Scanner;

public class PrintVowels {
    public static void printVowels(char[]a){
        for(int i=0;i<a.length;i++){
            if(a[i]=='a' || a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' ||a[i]=='I' ||a[i]=='U' ||a[i]=='O' ||a[i]=='E' ||a[i]=='A'  ){
                System.out.println("Vowels are: "+a[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        char a[] = new char[sc.nextInt()];
        for(int i =0;i<a.length;i++){
            System.out.println("Enter number to enter in array");
            a[i]=sc.next().charAt(0);
        }
        printVowels(a);
    }
}
