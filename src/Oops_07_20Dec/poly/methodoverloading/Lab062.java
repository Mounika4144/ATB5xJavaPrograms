package src.Oops_07_20Dec.poly.methodoverloading;

public class Lab062 {

    public static void main(String[] args) {


        // method overloading
        // load same name different

/*        person p = new person();
        p.speak(30);
        System.out.println(p);
       // p.speak("Please speak");
        System.out.println(p);
        p.speak(3.14);
        System.out.println(p);*/

        person p1 = new person();
        p1.walk("with stick");
        person p2 = new person();
        p1.walk(365.23);
        person p3 = new person();
        p3.walk(14);
        System.out.println(p3);



    }
}
