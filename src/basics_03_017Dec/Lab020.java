package src.basics_03_017Dec;

public class Lab020 {
    public static void main(String[] args) {

        // Ternary operator (?)

        //int a = condition ?

       // int a = (30>20) ? 10:20;
//        System.out.println(a);
//
//        String str = (10>20) ? "30":"Twenty";
//        System.out.println(str);
//
//        // Max of two numbers
//        int a1 = 50;
//        int b1 = 60;
//        int max = a1 < b1 ? 60 : 40;
//        System.out.println(max);
//
//        int a2 = 10;
//        int b2 = 20;
//        int c2 = 30;
//        int max1 = a2 > c2 ? 30 :20;

        int a = 10;
        int b = 90;
        int c = 70;

        int max4 =  (a>b) ? ((a>c) ? a :c) : ((b>c) ? b :c);
        System.out.println(max4);






    }
}
