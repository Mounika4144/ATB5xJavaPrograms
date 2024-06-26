package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab032 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the X");
        double x = sc.nextDouble();
        System.out.println("Enter the Y");
        double y = sc.nextDouble();
        System.out.println("Enter the Z");
        double z = sc.nextDouble();

        double result;

        // 3/ x^2+y^2-|z|
        // A+B-C -> A -> x^2 , B -> y^2 , c -> |Z|  -1 -> 1

        result = Math.cbrt(Math.pow(x,2)+ Math.pow(y,2) - Math.abs(z));
        System.out.println(result);

        sc.close();


    }
}
