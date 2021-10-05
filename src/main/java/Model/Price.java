package Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Price {
    private double unitPrice;
    private double discountPrice;

    public Price(double unitPrice) {
        this.unitPrice=unitPrice;
    }
}
