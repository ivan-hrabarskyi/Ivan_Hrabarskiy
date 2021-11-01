package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Peter", 3));
        students.add(new Student("Vasyl", 3));
        students.add(new Student("Andrew", 2));
        students.add(new Student("Ivan", 6));
        students.add(new Student("Pavlo",4));
        students.add(new Student("Artem", 5));

        //Student.printStudent(students, 3);
        System.out.println(students);
        Student.compareByName(students);
        System.out.println(students);
        Student.compareByCourse(students);
        System.out.println(students);
    }
}
