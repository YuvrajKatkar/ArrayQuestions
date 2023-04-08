package Duplicates;

import java.util.Scanner;

public class CountOfDuplicateChar {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char a[]= new char[size];
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the char to enter in array");
            a[i]=sc.next().charAt(0);
        }
        //a,b,c,b,a,a,
        int count1=0;
        for(int i=0;i<a.length;i++) {
            int count=0;
            if (a[i] !=' ') {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        //System.out.println(a[i]);
                        count++;
                        a[j] = ' ';
                    }
                }
            }
            if(count!=0){
                count1++;
            }

        }
        System.out.println("Number of duplicate char are:"+ count1);
    }
}
