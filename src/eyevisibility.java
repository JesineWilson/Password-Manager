import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class eyevisibility extends JFrame
{
    private JPasswordField passwordField;
    private JToggleButton toggleButton;

    public PasswordEyeSymbol() {
        super("Password Eye Symbol");

       
        toggleButton = new JToggleButton("Show Password");

        
        
       
        panel.add(toggleButton, BorderLayout.EAST);

        toggleButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (toggleButton.isSelected()) {
                    tf2.setEchoChar((char) 0); // Show password
                } else {
                    passwordField.setEchoChar('*'); // Hide password
                }
            }
        });

       
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new eyevisibility();
            }
        });
    }
}
