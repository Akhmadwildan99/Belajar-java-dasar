package strategy.pattern;

import java.math.BigDecimal;

public class GoSend implements ShippingStrategy{
    private String driverName;
    private String from;
    private String to;

    public GoSend(String driverName, String from, String to) {
        this.driverName = driverName;
        this.from = from;
        this.to = to;
    }

    @Override
    public void processShipping(BigDecimal price, String goods) {
        System.out.println("Proses pengantaran barang dengan Gosend\n");
        System.out.println("Biaya pengiriman: Rp. "+ price+ "\n");
        System.out.println("Barang yang dikirimkan:  "+ goods+ "\n");
        System.out.println("From: "+ from +"\n");
        System.out.println("To: "+ to +"\n");
        System.out.println("Nama driver: "+ driverName+"\n");
    }
}
