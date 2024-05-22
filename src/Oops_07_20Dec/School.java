package src.Oops_07_20Dec;

public class School {

    String school_name;
    int school_id;
    School(){

    }
    School(String school_name){
        this.school_name = school_name;
    }

    School(int school_id){
        this.school_id = school_id;
    }

    void printsdetails(){
        System.out.println("your school name is "+ this.school_name);
        System.out.println("Your schoold id  is "+this.school_id);
    }


}
