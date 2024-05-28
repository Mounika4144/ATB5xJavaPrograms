package src.Oops_07_20Dec.poly.methodoverriding;

public class Lab063 {
    public static void main(String[] args) {


        dog d = new dog();
        d.bark();

        Hound h = new Hound();
        h.bark();

       // Hound h1 = new dog();

        dog d1 = new Hound();   // java 22 is not possible
        d1.bark();           // latest java 22 it is not possible in java


    }




}
