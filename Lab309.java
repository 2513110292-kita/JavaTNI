import javax.swing.*;

public class Lab309 {

    public static void main(String[] args) {

        do {
            int total = 0;
            boolean ordering = true;

            int startOption = JOptionPane.showConfirmDialog(
                    null,
                    "Do you want to order menu?",
                    "Yakitori shop",
                    JOptionPane.YES_NO_OPTION
            );

            if (startOption == JOptionPane.NO_OPTION || startOption == JOptionPane.CLOSED_OPTION) {
                break;
            }

            while (ordering) {
                String menuMessage = "[1] Chicken Wing 99 B. \n" + "[2] Pork with Leek 89 B.\n" + "[3] Beef Tongue 109 B.\n" + "[0] Exit and Calculate\n" + "Enter menu number:";



                String input = JOptionPane.showInputDialog(
                        null,
                        menuMessage,
                        "Input",
                        JOptionPane.PLAIN_MESSAGE
                );

                if (input == null) {
                    break;
                }

                int menuChoice;
                try {
                    menuChoice = Integer.parseInt(input.trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(
                            null,
                            "Invalid menu number. Please try again.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                    );
                    continue;
                }

                switch (menuChoice) {
                    case 1:
                        total += 99;
                        break;
                    case 2:
                        total += 89;
                        break;
                    case 3:
                        total += 109;
                        break;
                    case 0:
                        ordering = false;
                        break;
                    default:
                        break;
                }
            }

            String summaryMessage =
                    "Total Price is " + total + " Baht.";

            JOptionPane.showMessageDialog(
                    null,
                    summaryMessage,
                    "Message",
                    JOptionPane.INFORMATION_MESSAGE
            );

        } while (true);
    }
}