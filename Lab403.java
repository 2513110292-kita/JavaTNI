import javax.swing.JOptionPane;

public class Lab403 {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "Admin1234";

    public static void main(String[] args) {
        String inputUsername = "";
        String inputPassword = "";
        boolean loginSuccess = false;

        while (!loginSuccess) {
            inputUsername = JOptionPane.showInputDialog(null,
                    "Enter username:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (inputUsername == null) {
                System.out.println("User cancelled the login process.");
                return;
            }

            inputPassword = JOptionPane.showInputDialog(null,
                    "Enter password:",
                    "Input",
                    JOptionPane.QUESTION_MESSAGE);

            if (inputPassword == null) {
                System.out.println("User cancelled the login process.");
                return;
            }

            boolean isUsernameCorrect = inputUsername.equalsIgnoreCase(USERNAME);

            boolean isPasswordCorrect = inputPassword.equals(PASSWORD);

            if (isUsernameCorrect && isPasswordCorrect) {
                loginSuccess = true;
                JOptionPane.showMessageDialog(null,
                        "Login Success!!",
                        "Message",
                        JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null,
                        "Incorrect username or password",
                        "Login Fail...",
                        JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}