/**
 * Created by andrey on 08.11.16.
 */
public class Product {
    private String name;
    private int price;
    private int quantityOnHand;

    public Product(String name, int price, int quantityOnHand) {
        this.name = name;
        this.price = price;
        this.quantityOnHand = quantityOnHand;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantityOnHand() {
        return quantityOnHand;
    }

    @Override
    public String toString() {
        return String.format("%10s  %4s      %4s         ",name,price,quantityOnHand);
    }
}
