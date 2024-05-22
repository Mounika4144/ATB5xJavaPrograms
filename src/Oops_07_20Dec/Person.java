package src.Oops_07_20Dec;

public class Person {


    String name ;
    Person(){
        System.out.println("DC");
    }

    Person(String name){
        this.name = name;
        System.out.println("DC");
    }

    void printdetail(){
        System.out.println(" you name is "  + this.name);
    }
}
