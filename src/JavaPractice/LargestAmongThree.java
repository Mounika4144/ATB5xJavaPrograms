package src.JavaPractice;

import java.util.Scanner;

public class LargestAmongThree {

    public static void main(String[] args) {

        /*System.out.println("Find the largest among 3 numbers");
        int n1 = 100;
        int n2 = 200;
        int n3 = 300;

        if(n1 > n2){
            System.out.println("The largest number is N1");
        }
            else {
                System.out.println("The Largest number is N2");
            }
        if (n2 > n3){
            System.out.println("The largest number is N2");
        }
        else {
            System.out.println("The Largest number is N3");
        }
        if (n3 > n1){
            System.out.println("The largest number is N3");
        }
        else {
            System.out.println("The Largest number is N1");
        }*/

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the N1 number");
        double num1 = sc.nextDouble();
        System.out.println("Enter the N2 number");
        double num2 = sc.nextDouble();
        System.out.println("Enter the N3 number");
        double num3 = sc.nextDouble();


    /*if (N1 > N2 || N1 > N3) {
            System.out.println("The Largest number is " + N1);
        } else if (N2 > N3 || N2 > N1) {
            System.out.println("The Largets number is " + N2);
        } else {
            System.out.println("The Largest number is " + N3);
        }*/

        double largest = num1;
        if (num2 > largest) {
            largest = num2;
        }
        if (num3 > largest) {
            largest = num3;
        }

        System.out.println("The largest number is: " + largest);
    }

}
