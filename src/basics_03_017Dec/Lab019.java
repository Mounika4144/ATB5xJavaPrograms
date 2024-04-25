package src.basics_03_017Dec;

public class Lab019 {
    public static void main(String[] args) {

        String s1 = "Mounika";
        // String Constant Pool - SCP / String Pool

        //New Operator - Object
        String s2 = new String("Mounika");
        // New operator is used to create the new object for class.
        // it returns of the address of newly created object
        System.out.println(s2);
        System.out.println(new String("Mounika"));

        String name = "The Testing Academy";
        System.out.println(name.length());
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());

        String name1 = new String("The Testing Academy");
        

        String str1 = "Hello";
        String str2 = "world";
        String str3 = "Hello world";
        String str4 = str1.concat(str2);

        String M1 ="Mounika";
        System.out.println(s1 instanceof String);
       // System.out.println(s2 instanceof object);
        // Result og instanceof is boolean




    }
}
