package src.JavaPractice;

import java.util.Scanner;

public class VowelorConsonant {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Find the character is vowel or consonant");

        System.out.println("Provide the character i will tell it is vowel or consonant");

        char ch = sc.next().charAt(0);
        if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
            System.out.println("Vowel");
        }else{
            System.out.println("Consonant");
        }
    }
}
