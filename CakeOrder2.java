import java.util.Scanner;

public class CakeOrder2 {
    private static Scanner sc = new Scanner(System.in);
    private static String[] flavors = {"Chocolate", "Vanilla", "Strawberry", "Lemon", "Red Velvet"};

    public static String selectFlavor() {
        int choice;
        while (true) {
            for (int i = 0; i < flavors.length; i++) {
                System.out.println("Press " + (i + 1) + " for " + flavors[i]);
            }
            System.out.print("Enter a flavor number: ");
            choice = sc.nextInt();
            if (choice >= 1 && choice <= flavors.length) {
                return flavors[choice - 1];
            }
            System.out.println("Invalid!! Try again.");
        }
    }

    public static void main(String[] args) {
        System.out.println("Press 1 to order Birthday Cake");
        System.out.println("Press 2 to order Cup Cake");
        System.out.print("Enter an option: ");
        int option = sc.nextInt();

        if (option == 1) {
            String flavor = selectFlavor();
            sc.nextLine();
            System.out.print("Enter a message: ");
            String msg = sc.nextLine();
            System.out.print("How many pounds: ");
            double pound = sc.nextDouble();
            BirthdayCake cake = new BirthdayCake(msg, pound, flavor, 350.0);
            System.out.println(cake.toString());
        } else if (option == 2) {
            String flavor = selectFlavor();
            System.out.print("How many pieces: ");
            int piece = sc.nextInt();
            CupCake cupcake = new CupCake(piece, flavor, 70.0);
            System.out.println(cupcake.toString());
        } else {
            System.out.println("Wrong option!! Try again!!");
        }
    }
}