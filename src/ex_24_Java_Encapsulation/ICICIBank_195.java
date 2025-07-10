package ex_24_Java_Encapsulation;

public class ICICIBank_195 {

    // Encapsulation is a fundamental concept in object-oriented programming
    // Bundling of data and methods that operate on that data within a single class
    // Data members/instance variables should be private in nature
    // Methods with getter and setter only, you can access the data members

    private String name;
    private long balance;

    public ICICIBank_195(String name, long balance){
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance, boolean isCashier) {
        if (isCashier == true){
            this.balance = balance;
        }
        else{
            System.out.println("Not allowed to change the password");
        }
    }
}
