package Model;

import Model.Enum.ProductMethodSale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Product {

    private String ref;
    private String name;
    private String description;
    private ProductMethodSale productMethodSale;
    private Price price;

    public Product(String ref, String name, Price price) {
        this.ref = ref;
        this.name = name;
        this.price = price;
    }
}
