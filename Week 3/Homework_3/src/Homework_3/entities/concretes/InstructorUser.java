package Homework_3.entities.concretes;

import Homework_3.entities.abstracts.Entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class InstructorUser extends IndividualUser implements Entities {
    private ArrayList<Course> givenCourses;

    public InstructorUser(int id, String email, String firstName, String lastName, LocalDate birthOfDate, String nationalityId, ArrayList<Course> givenCourses) {
        super(id, email, firstName, lastName, birthOfDate, nationalityId);
        this.givenCourses = givenCourses;
    }

    public ArrayList<Course> getGivenCourses() {
        return givenCourses;
    }

    public void setGivenCourses(ArrayList<Course> givenCourses) {
        this.givenCourses = givenCourses;
    }
}
