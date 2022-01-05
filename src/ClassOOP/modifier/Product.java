package ClassOOP.modifier;

import java.util.Objects;

public class Product {
    public String product;
    public int price;

    public Product(String product, int price) {
        this.product = product;
        this.price = price;
    }

    /**
     * method overide toString() untuk memberi informasi tentang isi object yang lebih mudah untuk dibaca
     * @return string
     */
    public String toString(){
       return "Profuct: " + product + ", price: " + price;
    }

//    public boolean equals(Object o){
//      if(o == this) {
//          return true;
//      }
//
//      if(!(o instanceof Product)){
//          return  false;
//      }
//
//      Product product = (Product) o;
//
//      if(this.price !== product.price){
//          return  false;
//      }
//
//      if(this.product != null){
//         return this.product.equals(product.product);
//      } else {
//          return product.product == null;
//      }
//    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product1 = (Product) o;
        return price == product1.price && Objects.equals(product, product1.product);
    }


    public int hashCode() {
        return Objects.hash(product, price);
    }
}
