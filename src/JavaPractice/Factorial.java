package src.JavaPractice;

public class Factorial {

    public static void main(String[] args) {

        System.out.println("To find the factorial");

        long fact = 1;
        int number = 5;
        for (int i=1; i<=number; i++){
            fact = fact*i;
        }

       System.out.println("The factorial of 5 is " + fact);
    }
}
