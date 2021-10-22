import Model.Product;
import Strategy.PricingStrategy;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Main {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal("5");
        BigDecimal b = new BigDecimal("3");
        BigDecimal c = a.remainder(b);
        System.out.println(a + "%" + b + " = " + c);
    }
//    public double totalPriceOrder(int quantity, Product product, PricingStrategy pricingStrategy) {
//        return pricingStrategy.calculatePrice(quantity, product.getPrice());
//    }
}
