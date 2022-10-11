package Homework_3.business.abstracts;

import Homework_3.entities.concretes.Category;

import java.util.ArrayList;

public interface CategoryService {
    void add(Category category);

    void delete(Category category);

    ArrayList<Category> categories(ArrayList<Category> categories);
}
