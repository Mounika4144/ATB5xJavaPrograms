package src.oops_06_Jan_2024;

public class Lab054 {

    public static void main(String[] args) {

       /* String str1 = "Mounika";
        str1 = str1.concat(" Lucky");
        System.out.println(str1);
        System.out.println(str1.contains("u"));*/


        String expected_result = "Password@312";
        String actual_result = "password@312";

        if(expected_result.equalsIgnoreCase(actual_result)){
            System.out.println("yes");

            String s1 = "Mounika";
            String s2 = new String("mounika");
            System.out.println(s1 == s2);
            System.out.println(s1.equals(s2));
            System.out.println(s1.equalsIgnoreCase(s2));

        }
    }
}
