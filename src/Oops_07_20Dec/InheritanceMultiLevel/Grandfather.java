package src.Oops_07_20Dec.InheritanceMultiLevel;

public class Grandfather {

    String house;
    int car;


     Grandfather(){
        System.out.println("Default DC");

            }

            Grandfather(String house, int car){
         this.house=house;
         this.car=car;

            }
            void oneBHK(){
        System.out.println("I have this BHK house" +this.house);
        System.out.println("I have this many cars"+this.car);



    }
}
