package Homework_3.business.concretes;

import Homework_3.business.abstracts.CategoryCheckService;
import Homework_3.business.abstracts.CategoryService;
import Homework_3.business.abstracts.CourseCheckService;
import Homework_3.entities.concretes.Category;

import java.util.ArrayList;

public class CategoryManager implements CategoryService {
    CategoryCheckService categoryCheckService;

    private ArrayList<Category> categories;

    public CategoryManager(CategoryCheckService categoryCheckService, ArrayList<Category> categories) {
        this.categoryCheckService = categoryCheckService;
        this.categories = categories;
    }

    @Override
    public void add(Category category) {
        if(!categoryCheckService.checkIfCategoryRegistered(category)){
            categories.add(category);
            return;
        }
        System.out.println(category.getName() + " adına sahip kategori sistemde var olduğu için kategori sisteme eklenemedi. ");
    }

    @Override
    public void delete(Category category) {
        categories.remove(category);
        System.out.println(category.getName() + " isimli kategori kategoriler listesinden çıkartıldı.");
    }

    @Override
    public ArrayList<Category> categories(ArrayList<Category> categories) {
        return null;
    }
}
