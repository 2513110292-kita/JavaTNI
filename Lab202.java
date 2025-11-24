import java.util.Scanner;

public class Lab202 {
    public static void  main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number 1: ");
        int a = sc.nextInt();

        System.out.print("Enter number 2: ");
        int b = sc.nextInt();

        System.out.println();

        System.out.println("Summation = " + (a+b));
        System.out.println("Subtraction = " + (a-b));
        System.out.println("Multiplication = " + (a * b));
        System.out.println("Division = " + ((double)a / b));
        System.out.println("Modulas = " + (a % b ));
    }
}
 