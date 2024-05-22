package src.JavaPractice;

import java.util.Scanner;

public class Multiplication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number i will provide the table");
        int value = sc.nextInt();
        for (int i = 1; i <= 10; i++){
            int M = 0;
            M = value * i ;
            System.out.println("Multiplication of the value is "+ M);
        }
    }
}
