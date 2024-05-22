package src.JavaPractice;

import java.util.Scanner;

public class PositiveNegative {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number i will tell postive or negative");
        System.out.println("Please enter");
        int value = sc.nextInt();


        if (value > 0){
            System.out.println("Value is postive");
        }
        else if (value < 0){
            System.out.println("Value is negative");
        }



    }
}
