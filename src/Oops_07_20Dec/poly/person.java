package src.Oops_07_20Dec.poly;

public class person {

    String x ;
    int y;


    void speak(String x){
        System.out.println("The person with "+ x);
    }

    void speak(int y){
        System.out.println("The person can speak with "+y);
    }

    double speak(double y){
        System.out.println("double " +y);
        return y;
    }
}
