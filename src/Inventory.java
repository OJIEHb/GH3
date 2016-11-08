import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by andrey on 08.11.16.
 */
public class Inventory {
    private Scanner scanner = new Scanner(System.in);
    private List<Product> products= new ArrayList<>();
    private int sumPriceProducts;

    public void sumUpInventoryValue(){
        int sum = 0;
        for(Product product: products){
            System.out.println(product + " " + sumUpProductValue(product));
            sum +=sumUpProductValue(product);
        }
        sumPriceProducts = sum;
    }
    private int sumUpProductValue(Product product){
        int sum = 0;
        sum = product.getPrice()*product.getQuantityOnHand();
        return sum;
    }

    public  void addProduct(){
        System.out.println("Enter name:");
        String name = scanner.next();
        System.out.println("Enter price:");
        int price = scanner.nextInt();
        System.out.println("Enter count");
        int count = scanner.nextInt();
        products.add(new Product(name,price,count));
    }

    public void showInventoryValue(){
        System.out.println("Name        Price     Count       Cost");
        sumUpInventoryValue();
        System.out.println("Total cost:"+getSumPriceProducts());
    }

    public List<Product> getProducts() {
        return products;
    }

    public int getSumPriceProducts() {
        return sumPriceProducts;
    }
}
