public class BirthdayCake extends Bakery {
    private String message;
    private double pound;

    public BirthdayCake(String message, double pound, String flavor, double unitPrice) {
        super(flavor, unitPrice);
        this.message = message;
        this.pound = pound;
    }

    public String getMessage() { return message; }
    public void changeMessage(String new_message) { this.message = new_message; }
    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public int getPackingCost() {
        if (this.pound >= 3) return 10;
        return super.getPackingCost();
    }

    @Override
    public double calculateTotalPrice() {
        return (getUnitPrice() * pound) + getPackingCost();
    }

    @Override
    public String toString() {
        return super.toString() + "\n" + getFlavor() + " birthday cake (message=" + message + ")"
                + "\nTotal price of Birthday Cake = " + calculateTotalPrice();
    }
}