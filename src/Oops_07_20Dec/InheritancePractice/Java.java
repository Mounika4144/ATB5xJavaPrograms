package src.Oops_07_20Dec.InheritancePractice;

public class Java extends Programming{

    String newfeature;


    Java (){
        System.out.println("Java DC");
    }

    Java(String newfeature, String Author){
        this.newfeature = newfeature;
        this.Author = Author;
    }

    void Jprintinfo(){
        System.out.println("The new feature is " + this.newfeature);
        System.out.println("The Author is "+ this.Author);
    }
}
