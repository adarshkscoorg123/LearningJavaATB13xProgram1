package ex_15_Java_Strings;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Person p = new Person("John", 30);
        System.out.println(p.toString());
    }


}
