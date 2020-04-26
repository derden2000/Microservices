package pro.antonshu.feign.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import pro.antonshu.entities.Product;

import java.util.List;

@Controller
public class ProductController {
    private ProductClient productClient;

    @Autowired
    public void setProductClient(ProductClient productClient) {
        this.productClient = productClient;
    }

    @RequestMapping("/products")
    public String getAllProducts(Model model) {
        List<Product> products = productClient.getAllProducts();
        model.addAttribute("products", products);
        return "products_list";
    }

    @RequestMapping("/products/{category}")
    public String getAllProductsByCategory(Model model, @PathVariable(name = "category") String category) {
        List<Product> products = productClient.getProductsByCategory(category);
        model.addAttribute("products", products);
        return "products_list";
    }
}
