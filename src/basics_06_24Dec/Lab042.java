package src.basics_06_24Dec;

public class Lab042 {
    public static void main(String[] args) {
        int[] marks_10 = {98, 90, 93, 76, 93};
        System.out.println(marks_10.length);
        System.out.println(marks_10[0]);
        System.out.println(marks_10[1]);
        System.out.println(marks_10[2]);
        System.out.println(marks_10[3]);
        System.out.println(marks_10[4]);
       // System.out.println(marks_10[5]);

        // Index --> 0 to length-1

        int[] a = new int[4];
        //a --> [0,0,0,0] --> default value of int -> 0
        System.out.println(a[0]);
        System.out.println(a[1]);
        a[0] = 41;
        System.out.println(a[0]);


        final int[] b = new int[5];
        b[0] = 55;
        System.out.println(b[0]);

    }
}
