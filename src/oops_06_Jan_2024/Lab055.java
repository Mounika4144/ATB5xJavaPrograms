package src.oops_06_Jan_2024;

public class Lab055 {

    public static void main(String[] args) {

        // Immutable (Can't be changed)
        String s1 = "Mounika";
        String s2 = new String("Mounika");


        //Mutable (Can be changed)
        StringBuilder sb1 = new StringBuilder("Lucky");
        sb1.append(" Mouni");
        System.out.println(sb1);

        StringBuffer sb = new StringBuffer(("hello"));
        sb.append(" World");
        System.out.println(sb);

        // String , New --> concat
        //Stringbuilder, StringBuffer --> append

        // If something is threadsafe se avoid
        // StringBuffer Vs StringBuilder w mostly use StringBuilder
    }
}
