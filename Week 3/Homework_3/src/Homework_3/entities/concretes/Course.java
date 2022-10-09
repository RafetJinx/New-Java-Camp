package Homework_3.entities.concretes;

import Homework_3.entities.abstracts.Entities;

public class Course implements Entities {
    private int id;
    private String name;
    private String publisher;
    private Instructor[] instructors;
    private double price;

    public Course(int id, String name, String publisher, Instructor[] instructors, double price) {
        this.id = id;
        this.name = name;
        this.publisher = publisher;
        this.instructors = instructors;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Instructor[] getInstructors() {
        return instructors;
    }

    public void setInstructors(Instructor[] instructors) {
        this.instructors = instructors;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
