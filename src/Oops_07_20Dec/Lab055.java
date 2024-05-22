package src.Oops_07_20Dec;

import java.util.Scanner;

public class Lab055 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your school name ");
        String name = sc.next();

        School S = new School(name);
        S.printsdetails();

        System.out.println("Enter the school id");
        int id = sc.nextInt();

        School S1 = new School(id);
        S1.printsdetails();






    }


}
