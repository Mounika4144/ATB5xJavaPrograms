package src.Oops_07_20Dec.ConstructerPractice;

import java.util.Scanner;

public class Lab058 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the school name ");
        String S = sc.next();
        System.out.println("Enter the school id ");
        int i = sc.nextInt();

        School sch = new School(S , i);
               sch.studetails();




    }




}
