package src.JavaPractice;

import java.util.Scanner;

public class OddorEven {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find the given number is Odd or Even");

        System.out.println("Provide the number");

        int odd = sc.nextInt();
        if(odd%2 == 1){
            System.out.println("Number is odd ");
        }else {
            System.out.println("Number is even");
        }

    }
}
