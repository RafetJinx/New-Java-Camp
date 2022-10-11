package Homework_3;

import Homework_3.adapters.concretes.CategoryServiceAdapter;
import Homework_3.adapters.concretes.CourseServiceAdapter;
import Homework_3.business.concretes.CategoryManager;
import Homework_3.business.concretes.CourseManager;
import Homework_3.entities.concretes.Category;
import Homework_3.entities.concretes.Course;
import Homework_3.entities.concretes.InstructorUser;

import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Course> courses = new ArrayList<>();
        ArrayList<InstructorUser> instructorUsers1 = new ArrayList<>();
        ArrayList<InstructorUser> instructorUsers2 = new ArrayList<>();

        InstructorUser instructorUser1 = new InstructorUser(
                1,
                "rafet@gmail.com",
                "Rafet 1",
                "Ersoy 1",
                LocalDate.of(2000,02,12),
                "1111",
                courses);

        InstructorUser instructorUser2 = new InstructorUser(
                1,
                "ersoy@gmail.com",
                "Rafet 2",
                "Ersoy 2",
                LocalDate.of(2000,05,18),
                "2222",
                courses);

        instructorUsers1.add(instructorUser1); // {Rafet Ersoy 1}

        instructorUsers2.add(instructorUser1);
        instructorUsers2.add(instructorUser2); // {Rafet Ersoy 1, Rafet Ersoy 2}


        Course course1 = new Course(1,"Kurs 1","Rafet",instructorUsers1,19.90);
        Course course2 = new Course(2,"Kurs 2","Ersoy",instructorUsers1,29.90);
        Course course3 = new Course(3,"Kurs 2","Rafet Ersoy",instructorUsers2,39.90);

        courses.add(course1);

        CourseManager courseManager = new CourseManager(new CourseServiceAdapter(courses), courses);
        courseManager.add(course2);
        courseManager.add(course3);

        System.out.println("--------------");
        Category category1 = new Category(1,"Kategori 1");
        Category category2= new Category(2,"Kategori 2");
        Category category3 = new Category(3,"Kategori 2");

        ArrayList<Category> categories = new ArrayList<>();
        categories.add(category1);

        CategoryManager categoryManager = new CategoryManager(new CategoryServiceAdapter(categories),categories);
        categoryManager.add(category2);
        categoryManager.add(category3);



    }
}
