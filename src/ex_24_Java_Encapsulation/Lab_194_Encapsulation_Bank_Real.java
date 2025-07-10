package ex_24_Java_Encapsulation;

public class Lab_194_Encapsulation_Bank_Real {

    public static void main(String[] args) {

        ICICIBank_195 adarsh = new ICICIBank_195("Adarsh", 100);
        long balance = adarsh.getBalance();
        System.out.println(balance);
        adarsh.setBalance(1500, false );
        long bal2 = adarsh.getBalance();
        System.out.println(bal2);

    }

}
