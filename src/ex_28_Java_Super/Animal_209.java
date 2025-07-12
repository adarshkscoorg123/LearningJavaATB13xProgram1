package ex_28_Java_Super;

public class Animal_209 extends God_208 {

    int gold = 100;

    @Override
    void sound(){
        System.out.println("Animal makes sound");
        super.sound();
    }

    Animal_209(){
        super();
    }

    Animal_209(int a,int b){
        super(45, 55);
        System.out.println(a+b);
    }

    void test(){
        System.out.println(super.gold);
        System.out.println(this.gold);
    }


}
