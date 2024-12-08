public class TestOrder {
    public static void main(String[] args) {
        // Define random Items
        Item item1 = new Item("mocha", 2.3);
        Item item2 = new Item("latte", 3.3);
        Item item3 = new Item("drip coffee", 1.5);
        Item item4 = new Item("cappuccino", 3.5);

        // Define orders
        Order order1 = new Order();
        Order order2 = new Order();
        Order order3 = new Order("Anas");
        Order order4 = new Order("Omar");
        Order order5 = new Order("Jamal");

        // Orders methods
        order1.addItem(item3);
        order1.addItem(item1);
        order1.setReady(true);

        order2.addItem(item2);
        order2.addItem(item4);
        order2.setReady(true);

        order3.addItem(item1);
        order3.addItem(item4);

        order4.addItem(item3);
        order4.addItem(item2);

        order5.addItem(item2);
        order5.addItem(item1);

        // Get order Status
        System.out.println("*====== Status of Orders ======*");
        System.out.println("Status of order1: " + order1.getStatusMessage());
        System.out.println("Status of order2: " + order2.getStatusMessage());
        System.out.println("Status of order3: " + order3.getStatusMessage());
        System.out.println("Status of order4: " + order4.getStatusMessage());
        System.out.println("Status of order5: " + order5.getStatusMessage());

        // Get order Totals
        System.out.println("*====== Totals of Orders ======*");
        System.out.println("Total of order1: " + order1.getTotal());
        System.out.println("Total of order2: " + order2.getTotal());
        System.out.println("Total of order3: " + order3.getTotal());
        System.out.println("Total of order4: " + order4.getTotal());
        System.out.println("Total of order5: " + order5.getTotal());

        // Display Orders
        System.out.println("*====== Display Order ======*");
        order1.display();
        System.out.println("*====== Display Order ======*");
        order2.display();
        System.out.println("*====== Display Order ======*");
        order3.display();
        System.out.println("*====== Display Order ======*");
        order4.display();
        System.out.println("*====== Display Order ======*");
        order5.display();

    }
}
