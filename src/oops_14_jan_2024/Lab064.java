package src.oops_14_jan_2024;

public class Lab064 {

    public static void main(String[] args) {

        /*System.out.println(Static.college_name);
        Static.printname();*/

        Static s = new Static();
        s.version = 25;
        s.printVersion();

        Static.college_name = "TTA";

        Static s1 = new Static();
        s1.version = 36;
        s1.printVersion();
    }
}
