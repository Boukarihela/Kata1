
package Strategy;

import Model.*;
import utils.Utils;

public class ThreeForDolarPricingStrategy implements PricingStrategy {
    @Override
    public double calculatePrice(int quantity, Price price) {

        double total= (quantity / 3) * price.getDiscountPrice() + (quantity % 3) * price.getUnitPrice();
        return Utils.totalDecimalConverter(total);



    }
}
