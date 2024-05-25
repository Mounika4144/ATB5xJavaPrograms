package src.Oops_07_20Dec.InheritancePractice;

public class Programming {

    String Author;

    int Version;

    Programming(){
        System.out.println("Programming DC");
    }

    Programming(String Author, int Version){
        this.Author = Author;
        this.Version = Version;
    }

    void hard(){

        System.out.println("Syntax is hard");
    }

    void printInfo(){
        System.out.println("Program Info -->" + this.Author + "Author " + this.Version);
    }
}
