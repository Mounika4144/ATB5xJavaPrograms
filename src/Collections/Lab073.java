package src.Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab073 {

    public static void main(String[] args) {

        List mymarks = new ArrayList();
        mymarks.add("80");
        mymarks.add("70");
        mymarks.add("52");

        Collections.sort(mymarks);
        System.out.println(mymarks);

    }
}
