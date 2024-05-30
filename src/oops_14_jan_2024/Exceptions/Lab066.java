package src.oops_14_jan_2024.Exceptions;

public class Lab066 {

    public static void main(String[] args) {

        try {
            String i = null;
            i.trim();
            System.out.println("Please trim");
        } catch (Exception e) {
            System.out.println("you are trying to trim null which is not possible");
        }
        }
    }

