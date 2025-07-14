package ex_30_Java_Abstraction_Interface;

public class Rectangle_223 implements Polygon_221{
    @Override
    public void getArea(int length, int breadth) {
        System.out.println("The area of a Rectangle is " +(length * breadth));
    }
}
