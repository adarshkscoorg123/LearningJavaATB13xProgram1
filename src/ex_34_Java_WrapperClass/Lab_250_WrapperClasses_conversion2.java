package ex_34_Java_WrapperClass;

public class Lab_250_WrapperClasses_conversion2 {

    public static void main(String[] args) {

        String num = "10";
        // String -> wrapper
        Integer a = Integer.parseInt(num);
        Integer b = Integer.valueOf(num);

        //wrapper to String (tostring method)
        System.out.println(a.toString());

        // Primitive to String
        int age = 45;
        Integer age_wrapper = age;
        System.out.println(age_wrapper.toString());

    }

}
