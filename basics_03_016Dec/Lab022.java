package basics_03_016Dec;

import java.sql.SQLOutput;

public class Lab022 {
    public static void main(String[] args) {

        // Decrement operator

        int b = 10;
        System.out.println( --b + b--);
        System.out.println(b);

        System.out.println(--b + b++ + ++b);
        System.out.println(b);
    }


}
