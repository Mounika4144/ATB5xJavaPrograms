package src.basics_03_017Dec;

import java.util.Scanner;

public class Lab028 {
    public static void main(String[] args) {

        // if, Switch -- condition based
        // Loops -->    which will repeat something  -- for, while, do while

        // switch -- Condition based - Multiple Condition

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of the day, I will tell which day it is");
        int day = sc.nextInt();

        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;
            case 3:
                System.out.println("Wed");
                break;
            case 4:
                System.out.println("Thu");
                break;
            case 5:
                System.out.println("Fri");
                break;
            case 6:
                System.out.println("Sat");
                break;
            case 7:
                System.out.println("Sun");
                break;
            default:
                System.out.println("Are You MAD");
                break; // This break is optional if default is last option

        }
        System.out.println("--- End Of the Program ---");
    }
}