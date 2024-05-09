package src.basics_06_24Dec;

import java.util.Scanner;

public class Lab046 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float[] marks = new float[5];
        System.out.println("Enter the First Subject");
        marks[0] = sc.nextFloat();
        System.out.println("Enter the second subject");
        marks[1] = sc.nextFloat();
        System.out.println("Enter the third subject");
        marks[2] = sc.nextFloat();
        System.out.println("Enter the fourth subject");
        marks[3] = sc.nextFloat();
        System.out.println("Enter the fifth subject");
        marks[4] = sc.nextFloat();

        for(int i =0; i< marks.length; i++){
            if(marks[i] <= 30){
                System.out.println("You are failed in this subject" + marks[i]);
            }
            System.out.println(marks[i]);
        }
        sc.close();
    }
}

