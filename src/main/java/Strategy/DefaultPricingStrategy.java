
package Strategy;

import Model.*;
import utils.Utils;

public class DefaultPricingStrategy implements PricingStrategy {


    @Override
    public double calculatePrice(int quantity, Price price) {

        double total= quantity * price.getUnitPrice();
        return Utils.totalDecimalConverter(total);

    }
}

