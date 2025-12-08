package ex_37_Java_CollectionsFramework_List;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class Lab_284_AL_Students {

    public static void main(String[] args) {

        Student s1 = new Student("Pramod", "1");
        Student s2 = new Student("Lucky", "2");
        Student s3 = new Student("Amith", "3");

        List<Student> myStudents = new ArrayList<Student>();
        myStudents.add(s1);
        myStudents.add(s2);
        myStudents.add(s3);

        System.out.println(myStudents);

    }
}


class Student {

    private String name;
    private String rollNo;

    public Student(String name, String rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" +name + '\'' +
                ", RollNo ='" +rollNo +'\'' +
                '}';
    }
}
