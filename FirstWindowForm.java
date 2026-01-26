import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstWindowForm {
    private JPanel winform;
    private JLabel LB_firstname;
    private JLabel LB_lastname;
    private JTextField txt_firstname;
    private JTextField txt_lastname;
    private JButton btn_Submit;
    private JButton btn_Reset;
    private JFrame jframe;

    public FirstWindowForm() {
        jframe = new JFrame();
        jframe.setContentPane(winform);
        jframe.setTitle("My First Window Form");
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setSize(300,200);
        jframe.setLocationRelativeTo(null);
        jframe.setVisible(true);
        btn_Submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txt_firstname.getText().isEmpty() | txt_lastname.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null,
                        "Please fill in your full name",
                        "Warning", JOptionPane.WARNING_MESSAGE);
                } else {
                JOptionPane.showMessageDialog(null, txt_firstname.getText() + " " + txt_lastname.getText());
                }
            }
        });
        btn_Reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txt_firstname.setText("");
                txt_lastname.setText("");
        }
    });
    }
    public static void main(String[] args) {
        FirstWindowForm windowForm = new FirstWindowForm();
    }
}
