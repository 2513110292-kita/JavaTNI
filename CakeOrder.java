import java.util.Scanner;

public class CakeOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birthday Cake's Details:");
        System.out.print("Enter a message on cake: ");
        String message = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor1 = scanner.nextLine();
        System.out.print("How many pounds: ");
        double pound = scanner.nextDouble();
        scanner.nextLine();
        BirthdayCake order1 = new BirthdayCake(message, pound, flavor1, 350.0);

        System.out.println("\nCup Cake's Details:");
        System.out.print("Enter a flavor: ");
        String flavor2 = scanner.nextLine();
        System.out.print("How many pieces: ");
        int piece = scanner.nextInt();
        scanner.nextLine();
        CupCake order2 = new CupCake(piece, flavor2, 65.0);

        System.out.println("\nDonut's Details:");
        System.out.print("Enter a topping: ");
        String topping = scanner.nextLine();
        System.out.print("Enter a flavor: ");
        String flavor3 = scanner.nextLine();
        System.out.print("Enter unit price: ");
        double price3 = scanner.nextDouble();
        Donut order3 = new Donut(topping, flavor3, price3);

        System.out.println(order1.toString());
        System.out.println(order2.toString());
        System.out.println(order3.toString());

        double totalAll = order1.calculateTotalPrice() + order2.calculateTotalPrice() + order3.calculateTotalPrice();
        System.out.println("\nTotal price = " + totalAll);
    }
}