package strategy.pattern;

import java.math.BigDecimal;

public class JNE implements ShippingStrategy{
    private String from;
    private String to;
    private String courier;

    public JNE(String courier, String from, String to) {
        this.courier = courier;
        this.from = from;
        this.to = to;
    }

    @Override
    public void processShipping(BigDecimal price, String goods) {
        System.out.println("Proses pengantaran barang dengan JNE\n");
        System.out.println("Biaya pengiriman: Rp. "+ price+ "\n");
        System.out.println("Barang yang dikirimkan:  "+ goods+ "\n");
        System.out.println("From: "+ from +"\n");
        System.out.println("To: "+ to +"\n");
        System.out.println("Nama kurir: "+ courier+"\n");
    }
}
