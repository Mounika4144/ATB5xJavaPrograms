package src.oops_14_jan_2024.Exceptions;

public class Lab068 {

    public static void main(String[] args) {

        try {
            int a = 0;
            int x = 10 / a;
        } catch (Exception e){
            System.out.println("Exit");
          //  System.exit(0);
        } finally {
            System.out.println("I am final");
        }
    }
}
