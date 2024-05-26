package src.Oops_07_20Dec.accessModifier.police;

public class Cop {

    public int gun;

    public Cop(int gun){
        this.gun = gun;
    }

    protected void canIShoot(){
        System.out.println("of couse!! you can shoot");
    }
}
