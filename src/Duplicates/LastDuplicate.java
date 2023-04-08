package Duplicates;

import java.util.Scanner;

public class LastDuplicate {
    public static void main(String args[]){
        System.out.println("Enter size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int a[] = new int[size];
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the number to enter in array");
            a[i]=sc.nextInt();
        }
        for(int i =a.length-1;i>=0;i--){
            int count =1;
            if(a[i]!=0){
                for(int j = a.length-1-1;j>=0;j--){
                    if(a[j]==a[i]){
                        count++;
                        a[j]=0;
                    }
                }
            }
            if(count!=1){
                System.out.println(a[i]);
                return;
            }
        }
    }
}
