package Model;

import Model.Enum.SaleType;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.math.BigDecimal;
import java.math.BigInteger;

@Getter
@AllArgsConstructor
public final class Product {

    private final String ref;
    private final String name;
    private String description;
    private BigDecimal price;
    private SaleType saleType;
    private BigDecimal discountPrice;

    public Product(String ref, String name, BigDecimal price) {
        this.ref = ref;
        this.name = name;
        this.price = price;
    }
}
