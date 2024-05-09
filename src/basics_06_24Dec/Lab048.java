package src.basics_06_24Dec;

import java.util.Scanner;

public class Lab048 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year");
        int year = sc.nextInt();

       /* if(year%4==0 || year%400==0){
            System.out.println("Leap year ");
        }
        else if(year%100!=0 ){
            System.out.println("Not an Leap year");
        }*/

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            System.out.println("Leap year");}
            else {
                System.out.println("Not an leap year");
            }

        }
    }
