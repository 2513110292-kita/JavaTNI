public class Donut extends Bakery {
    private String topping;

    public Donut(String topping, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.topping = topping;
    }

    public String getTopping() {
        return topping;
    }

    @Override
    public double calculateTotalPrice() {
        double extraCost = topping.equalsIgnoreCase("none") ? 0 : 5;
        return super.calculateTotalPrice() + extraCost;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDonut (" + getFlavor() + ") with " + topping + " topping"
                + "\nTotal price of Donut = " + calculateTotalPrice();
    }
}