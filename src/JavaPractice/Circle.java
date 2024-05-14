package src.JavaPractice;

import java.util.Scanner;

public class Circle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find the area of the circle");


        System.out.println("Provide the value of pie");
         double pie = sc.nextDouble();

        System.out.println("Provide the value of radius");
        double radius = sc.nextDouble();

        double circle = pie * radius * radius;

        System.out.println("Area of the circle is "+ circle );


    }
}
