package strategy.pattern;

import java.math.BigDecimal;

public interface ShippingStrategy {
    void processShipping(BigDecimal price, String goods);
}
