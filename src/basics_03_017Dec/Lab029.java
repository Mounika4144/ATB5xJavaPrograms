package src.basics_03_017Dec;

import java.util.Scanner;

public class Lab029 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name chrome, firefox, edge , mozilla");
        String browser = sc.next();
        switch(browser){
            case "chrome":
                System.out.println("Execute the chrome code");
                break;
            case "Firefox":
                System.out.println("Execute the firefox code");
                break;
            case "Edge":
                System.out.println("Execute the edge code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
        }

    }
}
