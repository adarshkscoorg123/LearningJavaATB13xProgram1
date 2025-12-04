package ex_30_Java_Abstraction_Interface;

public class Lab_231_Interview {

}

interface I11{}
interface I12{}
class A1{}
class B1{}

abstract class Pramod{
    abstract void pp();
}

class Test1 extends A1{}
// class Test2 extends A1,B1{} - This is not allowed as there is
// no multiple inheritance in Java

class Test2 extends Pramod{
    @Override
    void pp() {
        System.out.println("Overriding");
    }
}

class Test3 implements I11{}
class Test4 implements I11,I12{} // possible
class Test5 extends A1 implements I11,I12{}
//class Test6 implements I11 extends A1{} - This is not possible
// interface I3 extends A1{} - this is not possible since it interface cannot extend
// anything

interface I3{}
interface i4{
    default void m1(){

    }
    static void m2(){

    }
    //void concrete(){

    // }
}


