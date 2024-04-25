package src.basics_03_017Dec;

import java.util.Scanner;

public class Lab027 {
    public static void main(String[] args) {

        // Triangle Classifier:
        //if triangle is equal equilateral (all sides are equal)
        //isosceles (Exactly two sides are equal)
        //scalene(no sides are equal)

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the side1, side2,side3 , I will tell about the triangle");
        int side1 = sc.nextInt();
        int side2 = sc.nextInt();
        int side3 = sc.nextInt();

        if ((side1 == side2) && (side2 == side3) && (side1 == side3)){
            System.out.println("Equilateral");
        }
        else if((side1 == side2) ||(side2 == side3) || (side1 == side3)){
            System.out.println("isosceles");
        }
        else {
            System.out.println("scalene");

        }

    }
}
