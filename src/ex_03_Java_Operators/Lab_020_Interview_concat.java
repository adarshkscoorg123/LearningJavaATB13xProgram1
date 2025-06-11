package ex_03_Java_Operators;

public class Lab_020_Interview_concat {

    public static void main(String[] args) {

        System.out.println("Pramod" + "Dutta");
        int a = 10;
        int b = 20;
        System.out.println(a+b);

        String firstname = "Pramod";
        String lastname = "Dutta";

        System.out.println(firstname + lastname +a + b);
        System.out.println(a+b+firstname+lastname);
        System.out.println(firstname + lastname +(a + b));

        //BODMAS bracket, order, division, multiply, addition, subtraction

    }


}
