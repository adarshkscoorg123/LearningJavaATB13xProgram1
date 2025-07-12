package ex_27_Police;

public class GoodJuniorCop_202 {


    public static void main(String[] args) {
        Cop_200 jcop2 = new Cop_200(200);
        /*
        jcop2.gun = 250;
        jcop2.iCard = "saimadhava";
        jcop2.canIShoot();
        System.out.println(jcop2.gun);
        System.out.println(jcop2.iCard);
         */ // All the above can be accessed when we make
        // gun, icard and canIShoot as protected, since it can be accessed within the package
        // it can be accessed outside the package through inheritance

    }

}
