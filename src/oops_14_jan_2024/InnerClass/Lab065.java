package src.oops_14_jan_2024.InnerClass;

public class Lab065 {

    public static void main(String[] args) {

        ooc o = new ooc();
        ooc.SNIC icref = new ooc.SNIC();
        icref.show();
    }
}
       class ooc{

           static int o = 100;
           int a = 900;

           static class SNIC{

               void show(){
                  // System.out.println(a);
                   System.out.println(o);
               }
           }
       }


