public class Main {
    public static void main(String[] args) {
        Order order = new Order("Ahmad", new ExpressDelivery());
        order.addItem(new Meal("Burger Meal", 8, 1), 2);
        order.addItem(new Drink("Juice", 3, true));

        System.out.println("Subtotal = " + order.getSubtotal()); // 23.0
        System.out.println("Total    = " + order.getTotal());    // 28.0

        order.pay(new CardPayment());                            // 28.56
        System.out.println("Status   = " + order.getStatus());   // PAID

        order.deliver();
        System.out.println("Status   = " + order.getStatus());   // DELIVERED
    }
}
