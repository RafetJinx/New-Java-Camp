package Homework_3.business.abstracts;

import Homework_3.entities.concretes.Category;

public interface CategoryCheckService {
    boolean checkIfCategoryRegistered(Category category);
}
