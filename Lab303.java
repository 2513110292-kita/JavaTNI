import java.util.Scanner;

public class Lab303 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X, Y;
        String position;

        System.out.print("Enter the value for X coordinate: ");
        X = scanner.nextInt();
        System.out.print("Enter the value for Y coordinate: ");
        Y = scanner.nextInt();

        if (X == 0 && Y == 0) {
            position = "lies in the Origin";
        } else if (Y == 0) {
            position = "lies on the X-axis";
        } else if (X == 0) {
            position = "lies on the Y-axis";
        } else if (X > 0 && Y > 0) {
            position = "lies in the First quadrant";
        } else if (X < 0 && Y > 0) {
            position = "lies in the Second quadrant";
        } else if (X < 0 && Y < 0) {
            position = "lies in the Third quadrant";
        } else { // X > 0 และ Y < 0
            position = "lies in the Fourth quadrant";
        }

        System.out.printf("The coordinate point (%d,%d) %s\n", X, Y, position);

        scanner.close();
    }
}