package src.basics_03_017Dec;

import java.util.Scanner;

public class Lab026 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int Score = sc.nextInt();

        if (Score >= 90 && Score <=100){
            System.out.println("Grade A");
        }
        else if(Score >= 80 && Score <=90){
            System.out.println("Grade B");
        }
        else if(Score >=70 && Score <=80){
            System.out.println("Grade C");
        }
        else if(Score>=60 && Score <=70){
            System.out.println("Grade D");
        }
        else  {
            System.out.println("Fail");
        }
    }
}
