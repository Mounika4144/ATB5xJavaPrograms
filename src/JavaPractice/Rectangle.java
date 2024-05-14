package src.JavaPractice;

import java.util.Scanner;

public class Rectangle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find the area of the Rectangle");


        System.out.println("please provide the length ");

             int length = sc.nextInt();
            // System.out.println(length);

        System.out.println("please provide the breadth ");
            int breadth = sc.nextInt();
        // System.out.println(breadth);

           int  Rectangle;

       Rectangle = length * breadth ;
       System.out.println("Area of the Rectangle = " + Rectangle);

    }
}
