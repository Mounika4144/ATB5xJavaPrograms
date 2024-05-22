package src.Oops_07_20Dec.Inheritance;

public class Grandfather {

    String land;
    String address;
    int property;

    Grandfather(){
        this.land = land;
    }

    Grandfather (String address, int property){
        this.address = address;
    }

    void inherits(){
        System.out.println("The name of the land is " +this.land);
        System.out.println("The name of the land is " +this.address);
        System.out.println("The name of the land is " +this.property);
    }
}
