import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField user;
    private JPasswordField pass;
    private JButton masuk, keluar;
    private JCheckBox tampilpass;

    public LoginFrame() {
        // Set up the frame
        setTitle("Login");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        // Create and position the components
        JLabel label1 = new JLabel("Username:");
        label1.setBounds(50, 30, 80, 20);
        add(label1);

        user = new JTextField();
        user.setBounds(130, 30, 120, 20);
        add(user);

        JLabel label2 = new JLabel("Password:");
        label2.setBounds(50, 60, 80, 20);
        add(label2);

        pass = new JPasswordField();
        pass.setBounds(130, 60, 120, 20);
        add(pass);

        masuk = new JButton("Masuk");
        masuk.setBounds(50, 100, 100, 30);
        add(masuk);

        keluar = new JButton("Keluar");
        keluar.setBounds(150, 100, 100, 30);
        add(keluar);

        tampilpass = new JCheckBox("Tampilkan Password");
        tampilpass.setBounds(50, 140, 200, 20);
        add(tampilpass);

        // Add action listener to the buttons
        masuk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Add your login logic here
                // For example, check the entered username and password
                // If valid, proceed to the main application, else show an error message
                // You can access the values of user and pass using user.getText() and pass.getPassword()
            }
        });

        keluar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // Add action listener to the checkbox
        tampilpass.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (tampilpass.isSelected()) {
                    pass.setEchoChar((char) 0); // Show the password
                } else {
                    pass.setEchoChar('*'); // Hide the password
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame().setVisible(true);
            }
        });
    }
}
