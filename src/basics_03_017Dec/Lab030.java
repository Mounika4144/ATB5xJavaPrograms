package src.basics_03_017Dec;

import java.util.Scanner;

public class Lab030 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a char, I will tell it is vowel or not ");

        char user_input = sc.next().toCharArray()[0];
            switch(user_input){
                case 'a':
                    System.out.println("vowel");
                    break;
                case 'e':
                    System.out.println("vowel");
                    break;
                case 'i':
                    System.out.println("vowel");
                    break;
                case 'o':
                    System.out.println("vowel");
                    break;
                case 'u':
                    System.out.println("vowel");
                    break;
                default:
                    System.out.println("Not an vowel");
                    }


    }
}
