package Duplicates;

import java.util.Scanner;

public class printDuplicateChar {
    public static void main(String[] args) {
        System.out.println("Enter the size of array");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        char a[]= new char[size];
        for(int i = 0;i<a.length;i++){
            System.out.println("Enter the char to enter in array");
            a[i]=sc.next().charAt(0);
        }
        for(int i=0;i<a.length;i++) {
            if (a[i] !=' ') {
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        System.out.println(a[i]);
                        a[j] = ' ';
                    }
                }
            }
        }
    }

}
