package src.Oops_07_20Dec.ConstructerPractice;

public class Lab056 {

    public static void main(String[] args) {

        BankName sbi = new BankName();
        sbi.printdetails();

        System.out.println("------ ------");
        BankName hdfc = new BankName("HDFC" , "HDFC001", 600000);
        hdfc.printdetails();

        System.out.println("------ -------");
        BankName icici = new BankName("ICICI", "ICIC001", 100000);
        icici.balance = 5000;
        icici.printdetails();

    }
}