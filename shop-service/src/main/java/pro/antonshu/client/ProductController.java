package pro.antonshu.client;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.antonshu.client.entities.Product;

import java.util.List;


public interface ProductController {

    @GetMapping("/products")
    List<Product> getAllProducts();

    @GetMapping("/products/cat/{categoryTitle}")
    List<Product> getAllProductsByCategory(@PathVariable(value = "categoryTitle") String title);
}
