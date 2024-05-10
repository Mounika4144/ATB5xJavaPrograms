package src.Oops_07_20Dec;

import java.util.Scanner;

public class Lab052 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();
        System.out.println("Enter the value of b");
        int b = sc.nextInt();

        int temp = a;
         a = b;
         b = temp;

        System.out.println("value of a and b is "+ a +" " + b);



    }
}
