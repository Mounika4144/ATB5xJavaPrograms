package src.JavaPractice;

import java.util.Scanner;

public class SwapNumbers {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Swapping of tw numbers");
        System.out.println("Enter value of a");
        int a = sc.nextInt();

        System.out.println("Enter value of b");
        int b = sc.nextInt();

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("value of a = "+ a);
        System.out.println("value of a = "+ b);
    }
}
