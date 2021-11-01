package com.company;

import java.util.*;

public class Student {
    private String name;
    private int course;

    public Student(String name, int course){
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public int getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", course=" + course + '}' + '\n';
    }

    public static void printStudent(List<Student> student, Integer course){
        Iterator<Student> iterator = student.listIterator();
        while (iterator.hasNext()) {
            Student tempStudent = iterator.next();
            if (tempStudent.getCourse() == course) {
                System.out.println(tempStudent.getName());
            }
        }
    }



    public static List compareByCourse(List<Student> students){
        Collections.sort(students, new CourseComparator());
        return students;
    }

    public static List compareByName(List<Student> students){
        Collections.sort(students, new NameComparator());
        return students;
    }

}
