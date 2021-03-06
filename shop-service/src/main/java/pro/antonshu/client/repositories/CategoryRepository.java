package pro.antonshu.client.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pro.antonshu.client.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

    Category findOneByTitle(String title);
    Category findOneByTitleIgnoreCase(String title);

    boolean existsByTitle(String title);
}
