package utils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

public class Utils {
    public static DecimalFormat df2 = new DecimalFormat("#.##");

    private Utils() {
    }

    public static double totalDecimalConverter(double total) {
        BigDecimal bd = new BigDecimal(total).setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
