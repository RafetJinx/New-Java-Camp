package Homework_3.entities.concretes;

import Homework_3.entities.abstracts.Entities;

import java.time.LocalDate;

public class Instructor extends IndividualUser implements Entities {
    private Course[] givenCourses;

    public Instructor(int id, String email, String firstName, String lastName, LocalDate birthOfDate, String nationalityId, Course[] givenCourses) {
        super(id, email, firstName, lastName, birthOfDate, nationalityId);
        this.givenCourses = givenCourses;
    }

    public Course[] getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(Course[] givenCourses) {
        this.givenCourses = givenCourses;
    }
}
