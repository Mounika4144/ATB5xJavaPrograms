package src.Oops_07_20Dec.ConstructerPractice;

public class BankName {

    String name ;
    int balance ;

    String code;

    BankName(){
        name = "sbi";
        balance = 4000;
        code = "SBI001";
        System.out.println("Default C");
    }

    BankName(String Bname, String Bcode, int Bal){
        this.name = Bname;
        this.code = Bcode;
        this.balance = Bal;
        System.out.println("Param C");

    }

    void printdetails(){
        System.out.println("The name is "+ this.name);
        System.out.println("The balance is "+ this.balance);
        System.out.println("The Bankcode is " + this.code);
    }






}

