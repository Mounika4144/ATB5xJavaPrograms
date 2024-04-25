package src.basics_03_017Dec;

import java.util.Scanner;

public class Lab024 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the a,b");
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a>b){
            System.out.println("Max  " +a);
        }else{
            System.out.println("Max  " +b);
        }
    }
}
