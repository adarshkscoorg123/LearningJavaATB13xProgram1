package ex_29_Java_Abstraction;

public abstract class Employee_218 {

    private String name;
    private String address;
    private int number;

    Employee_218(){
        System.out.println("Default constructor");
    }

    public Employee_218(String name, String address, int number) {
        System.out.println("Constructing an employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    abstract double completepay();

    void mailCheck(){
        System.out.println("Mailing a check to " +this.name + " "+this.address);
    }
}
