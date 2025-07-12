package ex_26_Criminal;

import ex_27_Police.Cop_200;

public class Thief_203 extends Cop_200 {

    public Thief_203(int gun) {
        super(gun);
    }

    public static void main(String[] args) {

        Thief_203 t1 = new Thief_203(140);
        /*System.out.println(t1.gun);
        System.out.println(t1.iCard);
        t1.canIShoot(); */ // All the above can be accessed when icard, canIShoot and
        // gun are made protected through Inheritance


    }
}
