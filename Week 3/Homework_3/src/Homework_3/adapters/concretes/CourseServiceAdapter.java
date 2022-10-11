package Homework_3.adapters.concretes;

import Homework_3.business.abstracts.CourseCheckService;
import Homework_3.entities.concretes.Course;

import java.util.ArrayList;

public class CourseServiceAdapter implements CourseCheckService {
    private ArrayList<Course> courses;

    public CourseServiceAdapter(ArrayList<Course> courses) {
        this.courses = courses;
    }

    @Override
    public boolean checkIfCourseRegistered(Course course) {
        for(Course courseFor : courses){
            if(courseFor.getName().equals(course.getName())){
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean checkIfCoursePriceUnderZero(Course course) {
        if(course.getPrice() < 0){
            return true;
        }
        return false;
    }
}
