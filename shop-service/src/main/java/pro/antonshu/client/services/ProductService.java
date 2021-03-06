package pro.antonshu.client.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;
import pro.antonshu.client.entities.Category;
import pro.antonshu.client.entities.Product;
import pro.antonshu.client.repositories.ProductRepository;

import java.util.List;

@Service(value = "ProductService")
public class ProductService {

    private ProductRepository productRepository;

    @Autowired
    public void setProductRepository(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Page<Product> findAll(Specification<Product> specification, PageRequest pageRequest) {
        return productRepository.findAll(specification, pageRequest);
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).get();
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public List<Product> getAllProductsByCategory(Category category) {
        return productRepository.findAllByCategory(category);
    }

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public void deleteProductById(Long id) {
        productRepository.deleteById(id);
    }

    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findOneById(Long id) {
        return productRepository.getOne(id);
    }
}
