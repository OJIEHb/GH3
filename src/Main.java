import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by andrey on 08.11.16.
 */
public class Main {
    public static Inventory inventory = new Inventory();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String [] args){
        showMenu();
    }

    public static  void showMenu(){
        boolean exit = false;
        while (!exit){
            System.out.println("1 - add product   2 - show product   3 - exit");
            int menuItem = scanner.nextInt();
            switch (menuItem){
                case 1: inventory.addProduct();
                    break;
                case 2: inventory.showInventoryValue();
                    break;
                case 3: exit = true;
                    break;
                default:
                    System.out.println("Try again!");
            }
        }
    }
}
