package src.JavaPractice;

import java.util.Scanner;

public class XpowerY {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number i will tell the x power of y");
        System.out.println("Enter the x value");
        double x  = sc.nextDouble();
        System.out.println("Enter the Y value");
        double y = sc.nextDouble();

        System.out.println("The x to the power of y value is "  + Math.pow(x,y));


    }
}
