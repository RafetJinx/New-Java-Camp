package Homework_3.business.abstracts;

import Homework_3.entities.concretes.Course;

import java.util.ArrayList;

public interface CourseService {
    void add(Course course);

    void delete(Course course);

    ArrayList<Course> courses(ArrayList<Course> courses);
}
