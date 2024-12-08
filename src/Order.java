import java.util.ArrayList;

public class Order {
    private String name;
    private double total;
    private boolean ready;
    private ArrayList<Item> items;

    public Order() {
        this.name = "Guest";
        this.items = new ArrayList<>();
    }
    public Order(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    // ORDER METHODS
    public void addItem(Item item) {
        this.items.add(item);
        this.total += item.getPrice();
    }

    public String getStatusMessage() {
        if (this.ready) {
            return "Your order is ready.";
        }
        else {
            return "Thank you for waiting. Your order will be ready soon.";
        }
    }

    public double getOrderTotal() {
        double total = 0;
        for (Item item : this.items) {
            total += item.getPrice();
        }
        return total;
    }

    public void display() {
        System.out.println("Customer Name: " + this.name);
        for (Item item: this.items) {
            System.out.println(item.getName() + " - $" + item.getPrice());
        }
        System.out.println("Total: $" + this.getTotal());
    }



    // GETTERS & SETTERS
    // Getter and Setter for name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for total
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    // Getter and Setter for ready
    public boolean isReady() {
        return ready;
    }
    public void setReady(boolean ready) {
        this.ready = ready;
    }

}
