package ex_36_Java_Generics;

public class Lab_272_Generics_RealUsage {

    public static void main(String[] args) {

        GenericClass g1 = new GenericClass(10);
        System.out.println(g1.getData());

        GenericClass g2 = new GenericClass("Pramod");
        System.out.println(g2.getData());

        GenericClass g3 = new GenericClass(true);
        System.out.println(g3.getData());

        GenericClass g4 = new GenericClass(3.14);
        System.out.println(g4.getData());

        //T is a placeHolder only, It can be any data type
    }
}

class GenericClass<T> {

    private T data;

    public GenericClass(T data) {
        this.data = data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
