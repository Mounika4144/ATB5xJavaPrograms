package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab033 {

    public static void main(String[] args) {

        Scanner user_input = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = user_input.next();

        System.out.println("Enter your Age");
        int age = user_input.nextInt();

        System.out.println("Enter your salary");
        double salary = user_input.nextDouble();

        System.out.println("Your details are +" + name  +" "+ +age +" "+ +salary);

        user_input.close();

    }
}
