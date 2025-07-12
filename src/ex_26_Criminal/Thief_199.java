package ex_26_Criminal;


import ex_27_Police.Cop_200;

public class Thief_199 extends Cop_200{

    public Thief_199(int gun) {
        super(gun);
    }

    public static void main(String[] args) {
        Thief_199 t1 = new Thief_199(450);
        /*
        t1.iCard = "zabi";
        t1.canIShoot();
        t1.gun = 200; */ //the above can be accessed if icard, canIShoot and
                         // gun are made protected through Inheritance
    }








}

