package Package_Alpha;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainFrame extends JDialog {

    private final JPanel contentPanel = new JPanel();
    private JPasswordField passwordField;
    private JTextField emailTextField;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        try {
            MainFrame dialog = new MainFrame();
            dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
            dialog.setVisible(true);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Create the dialog.
     */
    public MainFrame() {
        setBounds(100, 100, 574, 300);
        getContentPane().setLayout(new BorderLayout());
        contentPanel.setBackground(new Color(255, 255, 255)); 
        contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
        getContentPane().add(contentPanel, BorderLayout.CENTER);
        contentPanel.setLayout(null);
        {
            JLabel lblcoreValuesImage = new JLabel("");
            Image img = new ImageIcon(this.getClass().getResource("/vondrehleCoreValues.png")).getImage();
            lblcoreValuesImage.setIcon(new ImageIcon(img));
            lblcoreValuesImage.setBounds(59, 67, 196, 195);
            contentPanel.add(lblcoreValuesImage);
        }
        {
            JLabel lblVonDrehleLogo = new JLabel("");
            Image img1 = new ImageIcon(this.getClass().getResource("/vondrehle_logo.png")).getImage();
            lblVonDrehleLogo.setIcon(new ImageIcon(img1));
            lblVonDrehleLogo.setBounds(107, 6, 361, 57);
            contentPanel.add(lblVonDrehleLogo);
        }
        {
            JButton btnLoginButton = new JButton("Login");
            btnLoginButton.setBackground(new Color(124, 150, 161));
            btnLoginButton.setBounds(305, 233, 269, 29);
            contentPanel.add(btnLoginButton);
            btnLoginButton.setActionCommand("OK");
            getRootPane().setDefaultButton(btnLoginButton);
        }
        {
            JLabel lblemail = new JLabel("email : ");
            lblemail.setBounds(292, 115, 46, 16);
            contentPanel.add(lblemail);
        }
        {
            JLabel lblPassword = new JLabel("Password : ");
            lblPassword.setBounds(267, 162, 71, 16);
            contentPanel.add(lblPassword);
        }
        
        passwordField = new JPasswordField();
        passwordField.setBackground(new Color(124, 150, 161));
        passwordField.setBounds(350, 157, 218, 21);
        contentPanel.add(passwordField);
        
        emailTextField = new JTextField();
        emailTextField.setBackground(new Color(124, 150, 161));
        emailTextField.setBounds(350, 110, 218, 26);
        contentPanel.add(emailTextField);
        emailTextField.setColumns(10);
        {
            JPanel buttonPane = new JPanel();
            buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
            getContentPane().add(buttonPane, BorderLayout.SOUTH);
        }
    }
}
