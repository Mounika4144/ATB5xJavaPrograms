package src.Oops_07_20Dec.ConstructerPractice;

public class ATBPerson {

    String name ;
    int id;
    String branch;


    // Default constructor
    ATBPerson(){
        System.out.println("I am called");
    }


    // param constructer
    ATBPerson(String name ){
        this.name = name;
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

    void printdetails(){
        System.out.println(this.name);
    }
}
