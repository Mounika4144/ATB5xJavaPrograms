package src.Oops_07_20Dec.InheritancePractice;

public class ATBPerson {

    String name ;
    int id;
    String branch;


    // Default constructor
    ATBPerson(){
        System.out.println("I am called");
    }

    ATBPerson(String name ){
        this.name = "Mounika";
        System.out.println("I am called");
    }


    void talk(){
       // System.out.println("The person can talk");
       System.out.println(name);
       // System.out.println(id);
        //System.out.println(branch);
    }

    void walk(){
        System.out.println("The person can walk");
        System.out.println(name);
    }
}
