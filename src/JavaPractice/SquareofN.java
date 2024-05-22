package src.JavaPractice;

import java.util.Scanner;

public class SquareofN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number i will tell the square of the number");

        double n = sc.nextDouble();
        double value;

        value = n * n ;

        System.out.println("The square of the give number is "+ value);
    }
}
