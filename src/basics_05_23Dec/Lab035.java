package src.basics_05_23Dec;

public class Lab035 {
    public static void main(String[] args) {
        System.out.println("print the value of i , but i want to break when i value becomes 5");
        for (int i =1 ; i<=10; i++){
            if(i==5){
                break;
            }
            System.out.println("value of i ="+ i);
        }
        System.out.println("end");
    }
}
