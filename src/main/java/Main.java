import Model.Product;
import Strategy.PricingStrategy;

public class Main {

    public double totalPriceOrder(int quantity, Product product, PricingStrategy pricingStrategy) {
        return pricingStrategy.calculatePrice(quantity, product.getPrice());
    }
}
