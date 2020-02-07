package pro.antonshu.feign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.antonshu.entities.Product;

import java.util.List;

@FeignClient("eureka-client")
public interface ProductClient {

    @GetMapping("/products/cat/{categoryTitle}")
    List<Product> getProductsByCategory(@PathVariable(value = "categoryTitle") String categoryTitle);

    @RequestMapping("/products")
    List<Product> getAllProducts();
}
