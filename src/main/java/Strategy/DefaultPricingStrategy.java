
package Strategy;

import Model.Product;

import java.math.BigDecimal;

public class DefaultPricingStrategy implements PricingStrategy {


    @Override
    public BigDecimal calculatePrice(Product product, double quantity) {
        BigDecimal total = null;
        switch (product.getSaleType()) {
            case UNIT:
                total = new BigDecimal(quantity).multiply(product.getPrice());
                break;
            case QUNATITY:
                total = new BigDecimal(quantity).multiply(product.getPrice());
                break;
        }
        return total;

    }
}

