package src.oops_14_jan_2024;

public class Static {

    static String college_name = "The Testing Academy";
    int version = 3;


    public static void printname() {
        System.out.println("Name is " + college_name);
      //  System.out.println("Version is "+ version); --> Not possible
    }



    public void printVersion() {
        System.out.println("Version is "+ version);
        System.out.println("college name is "+ college_name);

    }
}