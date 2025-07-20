package ex_36_Java_Generics;

public class Lab_272_Generics_RealUsage {

    public static void main(String[] args) {

        GenericClass g1 = new GenericClass(10);
        GenericClass g2 = new GenericClass("Pramod");
        GenericClass g3 = new GenericClass(true);
        GenericClass g4 = new GenericClass(3.14);

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
