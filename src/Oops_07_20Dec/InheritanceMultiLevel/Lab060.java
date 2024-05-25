package src.Oops_07_20Dec.InheritanceMultiLevel;

public class Lab060 {

    public static void main(String[] args) {

        Grandfather G  = new Grandfather("3 BHK", 3);
        G.oneBHK();

        Father F  = new Father("2 BHK", 2 );
        F.oneBHK();

        Son S = new Son("1 BHK", 1);
        S.oneBHK();
    }

}
