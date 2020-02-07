package pro.antonshu.client;

import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Lazy;
import org.springframework.web.bind.annotation.*;
import pro.antonshu.client.entities.Product;
import pro.antonshu.client.services.CategoryService;
import pro.antonshu.client.services.ProductService;

import java.util.List;

@RestController
public class ProductControllerImpl implements ProductController {
    @Autowired
    @Lazy
    private EurekaClient eurekaClient;

    @Value("${spring.application.name}")
    private String appName;

    private ProductService productService;

    private CategoryService categoryService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }

    @Autowired
    public void setCategoryService(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @Override
    @GetMapping("/products")
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @Override
    @GetMapping("/products/cat/{categoryTitle}")
    public List<Product> getAllProductsByCategory(@PathVariable(value = "categoryTitle") String title) {
        return productService.getAllProductsByCategory(categoryService.getCategoryByTitle(title));
    }

}
