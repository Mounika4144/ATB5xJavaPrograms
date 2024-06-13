package src.Collections;

import java.sql.SQLOutput;
import java.util.List;

public class Lab069 {
    public static void main(String[] args) {

        List fruits = List.of("apple", "Grapes", "Banana","Orange");
        List different_datatypes = List.of("Mounika", 27,"Lucky",32 );

        System.out.println(fruits.get(2));
        System.out.println(fruits);
        System.out.println(different_datatypes);
        System.out.println(fruits.indexOf("Banana"));

    }




}
