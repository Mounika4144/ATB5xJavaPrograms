package src.Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab071 {

    public static void main(String[] args) {

        List courselist = new ArrayList();
        courselist.add("ATB");
        courselist.add("MTB");
        courselist.add("PyATB");
        courselist.add("LapTB");
        courselist.add("SDETblueprint");

        List numlist = new ArrayList();
        numlist.add("150");
        numlist.add("200");
        numlist.add("300");
        numlist.add("600");

        courselist.addAll(numlist);
        System.out.println(courselist);

        Iterator iterator = courselist.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
