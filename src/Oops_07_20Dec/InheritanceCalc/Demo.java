package src.Oops_07_20Dec.InheritanceCalc;

public class Demo {

    public static void main(String[] args) {

        Calc obj = new Calc();
        int r1 = obj.add(80, 50);
        int r2 = obj.sub(96, 25);

        System.out.println("The addition of r1 is "+r1);
        System.out.println("The subtraction of r2 is "+r2);


        AdvCalc obj1 = new AdvCalc();
       int r3 =  obj1.divide(100 , 5);
        int r4 = obj1.Multi(60, 40);

        System.out.println("The division of r3 is "+r3);
        System.out.println("The multiplication r4 is "+r4);
    }
}
