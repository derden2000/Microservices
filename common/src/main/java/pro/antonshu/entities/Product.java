package pro.antonshu.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
public class Product {

    private Long id;

    private String title;

    private String description;

    private Category category;

    private BigDecimal price;

}
