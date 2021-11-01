package com.company;

import java.util.Comparator;

public class CourseComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return student1.getCourse() - student2.getCourse();
    }
}
