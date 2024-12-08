import javax.imageio.event.IIOReadProgressListener;
import java.util.ArrayList;

public class CoffeeKiosk {
    ArrayList<Item> menu;
    ArrayList<Order> orders;

    public  CoffeeKiosk() {
        this.menu = new ArrayList<>();
        this.orders = new ArrayList<>();
    }

    public void addMenuItem(String name, double price) {
        Item newItem = new Item(name,price);
        this.menu.add(newItem);
        int index = this.menu.indexOf(newItem);
        newItem.setIndex(index);
    }

    public void displayMenu() {
        for (Item thisItem: menu) {
            System.out.println(thisItem.getIndex() + " " + thisItem.getName() + " -- " + thisItem.getPrice());
        }
    }

    public void newOrder() {
        System.out.println("Please enter customer name for new order:");
        String name = System.console().readLine();
        Order newOrder = new Order(name);
        this.displayMenu();
        while (true) {
            System.out.println("Please enter a menu item index or q to quit:");
            String itemNumber = System.console().readLine();

            if (itemNumber.equals("q")) {
                break;
            }
            int itemIndex = Integer.parseInt(itemNumber);
            newOrder.addItem(menu.get(itemIndex));
        }
        System.out.println("\nThank you for your order:");
        newOrder.display();
    }



}
