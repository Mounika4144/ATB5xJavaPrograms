package basics_03_016Dec;

import java.util.Scanner;

public class Lab023 {
    public static void main(String[] args) {

        // conditions and loops

        //condition
 //         if Else

//       if (condition){

//         }Else{

//            }
//
//        boolean b = true;
//        if(b){
//            System.out.println("b is true");
//        }else {
//            System.out.println("b is false");
//        }
//
//        int a = 34;
//        if(a%2 ==1){
//            System.out.println("ODD Number");
//        }else{
//            System.out.println("Even Number");



            // Take an input from java ?
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number, I will tell if it is even/odd");
            int a1 = sc.nextInt();

            if(a1%2 ==1){
                System.out.println("ODD Number");
            }else{
                System.out.println("Even Number");

            }

    }
}
