package ClassOOP.Interface;

import java.math.BigDecimal;

public class EWallet implements PaymentStrategy {

    @Override
    public BigDecimal pay(BigDecimal price) {
        return price.add(PaymentStrategy.platformFee());
    }

    void eWalletSuccess() {
        System.out.println(PaymentStrategy.super.payMessageSuccess("E-wallet"));;
    }

    public static void main(String[] args) {
        EWallet eWallet = new EWallet();
        BigDecimal pay = eWallet.pay(new BigDecimal(4000));

        System.out.println(pay); // 9000
        eWallet.eWalletSuccess(); // Payment process with E-wallet method is success
    }

}
