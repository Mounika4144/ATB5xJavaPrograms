package basics_03_016Dec;

public class Lab018 {
    public static void main(String[] args) {

       /* // Casting - Mold
      //Widening is a process of converting lower type to higher type
        byte b = 10;
        //int a = b; // Implicit casting - JVM
        int a = (int) b; // Explicit casting - JVM

    //narrowing is a process of converting higher type to lower type
        int a1 = 350;
        //byte b1 = a1; // Implicit Casting
        int b1 = (byte) a1; // expicit Casting
        System.out.println(b1);*/

        int fees = 200;
        float GST = 54.09f;
        double total = fees + (double)GST;
        System.out.println(total);



    }
}
