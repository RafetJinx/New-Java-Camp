package Homework_3.business.abstracts;

import Homework_3.entities.concretes.Course;

public interface CourseCheckService {
    boolean checkIfCourseRegistered(Course course);
}
