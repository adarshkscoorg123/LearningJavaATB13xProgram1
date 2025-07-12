package ex_27_Police;

public class JuniorCop_201 {

    public static void main(String[] args) {

        Cop_200 jcop = new Cop_200(150);
        /*jcop.gun = 250;
        jcop.iCard = "Adarsh";
        jcop.canIShoot(); */  // All the above can be accessed when we make
                              // gun, icard and canIShoot as public, since public
                              // can be accessed inside and outside packages and anywhere

        /*jcop.gun = 300;
        jcop.iCard = "keshava";
        System.out.println(jcop.gun);
        System.out.println(jcop.iCard);
        jcop.canIShoot(); */ // All the above can be accessed when we make gun, iCArd
                             // and canIshoot as default, since default can be accessed
                            // inside the package but not outside the package

        // jcop.gun = 350;  // Cannot be acceesed if gun is private
        // jcop.icard = "Madhava"; Cannot be accessed if icard is private
        // jcop.CanIShoot();  Cannot be accessed if CanIShoot is made private


    }


}
