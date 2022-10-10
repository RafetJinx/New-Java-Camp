package Homework_3.business.concretes;

import Homework_3.business.abstracts.CourseCheckService;
import Homework_3.business.abstracts.CourseService;
import Homework_3.entities.concretes.Course;

import java.util.ArrayList;

public class CourseManager implements CourseService {
    CourseCheckService courseCheckService;
    private ArrayList<Course> courses;

    public CourseManager(CourseCheckService courseCheckService, ArrayList<Course> courses) {
        this.courseCheckService = courseCheckService;
        this.courses = courses;
    }

    @Override
    public void add(Course course) {
        if(!courseCheckService.checkIfCourseRegistered(course)){
            courses.add(course);
            return;
        }
        System.out.println(course.getName() + " adına sahip kurs sistemde var olduğu için kurs sisteme eklenemedi.");
    }

    @Override
    public void delete(Course course) {
        courses.remove(course);
    }

    @Override
    public ArrayList<Course> courses(ArrayList<Course> courses) {
        return courses;
    }


}
