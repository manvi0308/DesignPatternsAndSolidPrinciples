package designpattern.adapterdesignpattern;

import java.util.*;

public class DemoClient {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new SchoolStudent("Manvi","chaddha0108@xyz.com", "noida"));
        CollegeStudent collegeStudent = new CollegeStudent("Manvi", "sfiuwhfiuwhf", "Moradabad");
        studentList.add(new StudentAdapter(collegeStudent));

        System.out.println(studentList);
    }
}
