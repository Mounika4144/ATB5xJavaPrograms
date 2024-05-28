package src.Oops_07_20Dec.poly.polypractice;

public class IV1 {

    public static void main(String[] args) {

        /*person h = new person(25);
        System.out.println(h);
        person h1 = new person(25);
        System.out.println(h1.a);*/

        person h3 = new person(50, false);
        System.out.println(h3.b);


    }
    }

       class person {

        int a;
        boolean b;

        person() {
            this.a = 10;
        }

        person(int b) {
            this.a = b;
        }

        person(int b, boolean a) {
            this.a = b;
            this.b = a;
        }

    }

