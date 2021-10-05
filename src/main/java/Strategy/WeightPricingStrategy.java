package Strategy;

import Model.Price;
import utils.Utils;

public class WeightPricingStrategy implements PricingStrategy {

    @Override
    public double calculatePrice(int quantity, Price price) {
        double total= quantity * price.getUnitPrice();
        return Utils.totalDecimalConverter(total);

    }
}
