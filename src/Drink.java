public class Drink extends MenuItem {
    private boolean large;

    public Drink(String name, double basePrice, boolean large) {
        super(name, basePrice);
        this.large = large;
    }

    @Override
    public double getPrice() {
        return large ? getBasePrice() + 1 : getBasePrice();
    }
}
