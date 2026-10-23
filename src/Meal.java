public class Meal extends MenuItem {
    private int extraToppings;

    public Meal(String name, double basePrice, int extraToppings) {
        super(name, basePrice);
        this.extraToppings = extraToppings;
    }

    @Override
    public double getPrice() {
        return getBasePrice() + 1.5 * extraToppings;
    }
}
