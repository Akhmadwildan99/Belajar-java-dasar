package strategy.pattern;

import java.math.BigDecimal;

public class ShippingApplication {

    public static void main(String[] args) {
        ShippingStrategy goSendStrategy = new GoSend("Nagasawa", "Okinawa", "Timika");
        ShippingProcessor shippingProcessor = new ShippingProcessor(goSendStrategy);

        shippingProcessor.processShipping(new BigDecimal(20000), "Kursi lipat");

        System.out.println("\n ================================================\n");
        // JNE
        ShippingStrategy jneStrategy = new JNE("Steven", "Jakbar", "Jaksel");
        shippingProcessor.setShippingStrategy(jneStrategy);

        shippingProcessor.processShipping(new BigDecimal(20000), "Kursi melayang");
    }
}
