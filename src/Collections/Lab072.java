package src.Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab072 {
    public static void main(String[] args) {

        List ttacourselist = new ArrayList();
        ttacourselist.add("ATB");
        ttacourselist.add("MTB");
        ttacourselist.add("LAPIT");
        ttacourselist.add("SDET Blueprint");

        ListIterator lt = ttacourselist.listIterator(ttacourselist.size());
        while(lt.hasPrevious()){
            System.out.println(lt.previous());
        }
    }
}
