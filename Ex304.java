import java.util.Scanner;

public class Ex304 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a message : ");
        int message = scan.nextInt();

        System.out.println("How many loop : ");
        int loop = scan.nextInt();

        for (int i = 1; i <= loop; i++){
            System.out.println(i + " " + message);
        }
    }
}