package src.Oops_07_20Dec.ConstructerPractice;

public class Person {

    String gender;
    int kids;
    String cars;
    Person(){
        System.out.println(" I am Default C ");
    }

    Person(String gen, int kids, String cars){
        this.gender = gen;
        this.kids = kids;
        this.cars = cars;
    }

    void print(){
        System.out.println("The gender of the perspn is " + this.gender);
        System.out.println("The number of kids that person has is" + this.kids);
        System.out.println("The type of car that person has is " + this.cars);
    }

}
