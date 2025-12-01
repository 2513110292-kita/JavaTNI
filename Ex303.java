import java.util.Scanner;

public class Ex303 {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter number 1 : ");
        int num1 = scan.nextInt();

        System.out.println("Enter number 2 : ");
        int num2 = scan.nextInt();

        System.out.println("Enter number 3 : ");
        int num3 = scan.nextInt();

        if (num1 == num2 && num2 == num3){
            System.out.println("All number are the same.");
        } else {
            System.out.println("All cumbers are NOT the same.");
        }
        System.out.println(num1 == num2 && num2 == num3 ? "All numbers are the same." : "All number are NOT the same.");
        System.out.println("All numbers are " + (num1 == num2 && num2 == num3 ? "the same." : "NOT the same."));
    }
}
