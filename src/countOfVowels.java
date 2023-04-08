import java.util.Scanner;

public class countOfVowels {
     public static void printVowels(char[]a){
          int sum=0;
          for(int i=0;i<a.length;i++){
               if(a[i]=='a' || a[i]=='e' ||a[i]=='i' ||a[i]=='o' ||a[i]=='u' ||a[i]=='I' ||a[i]=='U' ||a[i]=='O' ||a[i]=='E' ||a[i]=='A'  ){
                    sum++;
               }
          }
          System.out.println("Count of ascii of Vowels are: "+sum);
     }
     public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter size of array: ");
          char a[] = new char[sc.nextInt()];
          for(int i =0;i<a.length;i++){
               System.out.println("Enter char to enter in array");
               a[i]=sc.next().charAt(0);
          }
          printVowels(a);
     }
}
