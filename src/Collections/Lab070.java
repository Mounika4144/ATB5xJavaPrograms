package src.Collections;

import java.util.ArrayList;
import java.util.List;

public class Lab070 {

    public static void main(String[] args) {



       List mylist = new ArrayList();
      //  List<String> mylist = new ArrayList(); if we want to restrict to particular datatype the we need to add inside this <> operator
        mylist.add("Mounika");
        mylist.add("Lucky");
        mylist.add(258);
        System.out.println(mylist);
        mylist.set(2,"Ganthakoru");
        System.out.println(mylist);

        for(int i=0; i< mylist.size();i++){
            System.out.println(mylist.get(i));
        }
    }
}
