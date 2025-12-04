package ex_28_Java_Super;

public class Car_206  extends Vehicle_205{

    private int maxSpeed = 281;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    Car_206(){
        super(); // Parents default constructor
        System.out.println("Default constructor of child");
    }

    Car_206(int a ){
        super(10); // Parents parametrized constructor
        System.out.println("parametrized constructor of child" + a);
    }


    void display() {
        System.out.println("Child overrides");
        System.out.println(super.maxSpeed); // Parents instance variable call
        System.out.println(this.maxSpeed); // this means my(child's) variables call
    }
}
