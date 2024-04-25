package src.basics_05_23Dec;

import java.util.Scanner;

public class Lab040 {
    public static void main(String[] args) {

        // Problem
        // Factorial Program

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
        long fact =1;

        int i =1;
        while(i<=number){
            fact=fact*i;
            i++;
        }
        System.out.println("Fact -> "+ fact);
        sc.close();
    }
}
