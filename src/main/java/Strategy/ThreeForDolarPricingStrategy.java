
package Strategy;

import Model.Product;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ThreeForDolarPricingStrategy implements PricingStrategy {
    @Override
    public BigDecimal calculatePrice(Product product, double quantity) {
        BigDecimal total = new BigDecimal(quantity).divide(new BigDecimal(3), RoundingMode.DOWN).multiply(product.getDiscountPrice()).add(new BigDecimal(quantity).remainder(new BigDecimal(3)).multiply(product.getPrice()));
        return total;
    }
}
