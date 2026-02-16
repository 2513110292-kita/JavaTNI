import javax.swing.JOptionPane;

public class CakeOrder3 {
    public static void main(String[] args) {
        String message = JOptionPane.showInputDialog("Enter a message on cake:");
        String flavor = JOptionPane.showInputDialog("Enter a flavor:");
        double pound = Double.parseDouble(JOptionPane.showInputDialog("How many pounds:"));

        BirthdayCake order = new BirthdayCake(message, pound, flavor, 350.0);

        int confirm;
        do {
            confirm = JOptionPane.showConfirmDialog(null,
                    order.toString() + "\nConfirm this order?",
                    "Confirm Order",
                    JOptionPane.YES_NO_OPTION);

            if (confirm == JOptionPane.NO_OPTION) {
                String newMessage = JOptionPane.showInputDialog("Enter a new message for changing:");
                order.setMessage(newMessage);
            }
        } while (confirm != JOptionPane.YES_OPTION);

        JOptionPane.showMessageDialog(null, "Your order is confirmed. Thank you!");
    }
}