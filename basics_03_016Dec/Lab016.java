package basics_03_016Dec;

public class Lab016 {
    public static void main(String[] args) {

        // || --> Or Operator
        //  T || T --> T
        //  T || F --> T
        //  F || T --> T
        //  F || F --> F

        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || true);
        System.out.println(false || false);

        System.out.println("-------------");

        // && --> And operator
        //  T && T --> T
        //  T && F --> F
        //  F && T --> F
        //  F && F --> F

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

    }
}
