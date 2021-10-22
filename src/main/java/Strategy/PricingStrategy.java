package Strategy;

import Model.Product;

import java.math.BigDecimal;

public interface PricingStrategy {
    BigDecimal calculatePrice(Product product, double quantity);
}
