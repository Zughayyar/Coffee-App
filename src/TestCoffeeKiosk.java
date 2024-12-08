public class TestCoffeeKiosk {
    public static void main(String[] args) {
        CoffeeKiosk testApp = new CoffeeKiosk();
        testApp.addMenuItem("banana", 2.00);
        testApp.addMenuItem("coffee", 1.50);
        testApp.addMenuItem("latte", 4.50);
        testApp.addMenuItem("cappuccino", 3.00);
        testApp.addMenuItem("muffin", 4.00);

        testApp.newOrder();




    }
}
