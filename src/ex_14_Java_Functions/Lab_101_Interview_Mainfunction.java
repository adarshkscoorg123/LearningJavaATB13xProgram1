package ex_14_Java_Functions;

public class Lab_101_Interview_Mainfunction {

    public static void main(String[] args) {
        System.out.println("Main function");
        main("adarsh");
        int method_overloading = main(20);
        System.out.println(method_overloading);
    }
    // this is main method overloading, there can be many main methods with different signatures,
    // but JVM recognises only one main method which contains String[] args to start the execution
    public static void main(String args) {
        System.out.println("This is method overloading " +args);
    }

    public static int main(int args) {
        return 10;
    }
}

