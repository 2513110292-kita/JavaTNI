public class MasterOrder {
    public static void main(String[] args) {
        Bakery[] myOrders = new Bakery[3];

        myOrders[0] = new BirthdayCake("Happy Birthday", 2.0, "Chocolate", 350.0);
        myOrders[1] = new CupCake(10, "Vanilla", 60.0);
        myOrders[2] = new Donut("Almond", "Coffee", 35.0);

        double totalAll = 0;

        System.out.println("--- Summary of All Orders ---");

        for (int i = 0; i < myOrders.length; i++) {
            System.out.println(myOrders[i].toString());
            System.out.println("---------------------------");
            totalAll += myOrders[i].calculateTotalPrice();
        }

        System.out.println("Total price for all orders = " + totalAll + " Baht.");
    }
}