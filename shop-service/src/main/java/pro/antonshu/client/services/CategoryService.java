package pro.antonshu.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.antonshu.client.entities.Category;
import pro.antonshu.client.repositories.CategoryRepository;

import java.util.List;

@Service
public class CategoryService {

    private CategoryRepository categoryRepository;

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    public boolean existByTitle(String title) {
        return categoryRepository.existsByTitle(title);
    }

    public Category getCategoryByTitle(String title) {
        return categoryRepository.findOneByTitle(title);
    }
}
