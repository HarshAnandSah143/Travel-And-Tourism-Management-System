package travel.management.system;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.net.URI;

public class Paytm extends JFrame {

    public Paytm() {
        setTitle("Pay using Paytm");
        setSize(400, 200);
        setLocation(600, 300);
        setLayout(null);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JLabel label = new JLabel("Click the button below to pay via Paytm:");
        label.setBounds(50, 40, 300, 20);
        add(label);

        JButton payButton = new JButton("Open Paytm");
        payButton.setBounds(120, 70, 150, 30);
        add(payButton);

        payButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://paytm.com"));
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Unable to open browser.\n" + ex.getMessage());
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(150, 110, 80, 30);
        add(back);
        back.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Paytm();
    }
}