package src.Oops_07_20Dec.poly.methodoverloading;

public class person {

    String x ;
    int y;


   /* void speak(String x){
        System.out.println("The person with "+ x);
    }*/

    void speak(int y){
        System.out.println("The person can speak with "+y);
    }

    double speak(double y){
        System.out.println("double " +y);
        return y;
    }


    void walk(String A){
        System.out.println("The person can walk "+ A);
    }

    void walk(double B){
        System.out.println("The person can walk these many kilometers "+ B);
    }


    int walk(int C){
        System.out.println("The pesron can walk in these many styles " + C);
        return C;
    }


}
