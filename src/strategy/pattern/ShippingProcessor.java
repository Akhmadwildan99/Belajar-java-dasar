package strategy.pattern;

import java.math.BigDecimal;

public class ShippingProcessor {
    private ShippingStrategy shippingStrategy;

    public ShippingProcessor(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }

    public void processShipping(BigDecimal price, String goods) {
        this.shippingStrategy.processShipping(price, goods);
    }
}
