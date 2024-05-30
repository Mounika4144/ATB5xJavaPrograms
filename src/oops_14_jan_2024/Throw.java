package src.oops_14_jan_2024;

public class Throw {
    public static void main(String[] args) {

        extracted(0);

    }

    private static void extracted(int b) {
        int a;
        if(b==0){
            throw new ArithmeticException("B can't be zero");
        }else {
            a = 10 / b;
        }
        System.out.println(a);
    }
}
