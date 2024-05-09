package src.basics_06_24Dec;

public class Lab047 {

    public static void main(String[] args) {

        // FIZZBUZZ problem
        // write a program that prints numbers from 1 to 100
        //for multiplies of 3, print "Fizz' instead of the number,
        // and for the multiplies of 5 , print 'Buzz' instead of the number
        // both multiples of 3 and 5 print 'FizzBuzz'

        for (int i = 0; i<=100 ; i++){
            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if(i%3==0){
                System.out.println("Fizz");
            }
            else if(i%5==0){
                System.out.println("Buzz");
            }
            System.out.println(i);
        }


    }



}
