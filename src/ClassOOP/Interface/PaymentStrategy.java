package ClassOOP.Interface;

import java.math.BigDecimal;

public interface PaymentStrategy {
    BigDecimal pay(BigDecimal price);
    static BigDecimal platformFee() {
        return new BigDecimal(5000);
    }

    default String  payMessageSuccess(String payMethod) {
        return "Payment process with " + payMethod + " method is success";
    }
}

