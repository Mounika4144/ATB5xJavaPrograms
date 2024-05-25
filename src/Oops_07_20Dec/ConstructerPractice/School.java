package src.Oops_07_20Dec.ConstructerPractice;

public class School {

    String schoolname ;
    int studentid;


    School(){
        System.out.println("Default C");
    }

    School(String schoolname, int studentid){
        this.schoolname = schoolname;
        this.studentid = studentid;
    }

    void studetails(){
        System.out.println("The school name is " +this.schoolname);
       System.out.println("The student id is "+ this.studentid);
    }

}
