package Homework_3.adapters.concretes;

import Homework_3.business.abstracts.CategoryCheckService;
import Homework_3.entities.concretes.Category;

import java.util.ArrayList;

public class CategoryServiceAdapter implements CategoryCheckService {
    private ArrayList<Category> categories;

    public CategoryServiceAdapter(ArrayList<Category> categories) {
        this.categories = categories;
    }

    @Override
    public boolean checkIfCategoryRegistered(Category category) {
        for(Category categoryFor : categories){
            if(categoryFor.getName().equals(category.getName())){
                return true;
            }
        }
        return false;
    }
}
