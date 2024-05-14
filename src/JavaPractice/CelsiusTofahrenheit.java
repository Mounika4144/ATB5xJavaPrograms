package src.JavaPractice;

import java.util.Scanner;

public class CelsiusTofahrenheit {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Calculation of celcius to farenheit");

        /*System.out.println("Provide the F value");
        double F = sc.nextDouble();*/

        System.out.println("Provide the C value");
        double C = sc.nextDouble();

        double F;

        F = (C * 9/5) + 32;
        System.out.println("The value of F is " + F);





    }
}
