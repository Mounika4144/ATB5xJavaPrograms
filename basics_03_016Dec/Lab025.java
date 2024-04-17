package basics_03_016Dec;

import java.util.Scanner;

public class Lab025 {
    public static void main(String[] args) {
         // if, else if, else

        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();

        if(number > 20){
            System.out.println("number is > 20");
        }else if(number > 10){
            System.out.println("number is > 10");
        }else if( number >5){
            System.out.println("number is < 10");
        }else {
            System.out.println("number is < 5 ");
        }
    }
}
