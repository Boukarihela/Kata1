package Strategy;

import Model.*;
import org.apache.commons.lang3.tuple.Pair;


import java.text.DecimalFormat;
import java.util.List;

public interface PricingStrategy {
    double calculatePrice(int quantity, Price price);
}
