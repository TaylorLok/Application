package com.client.ac.za;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class clientSide {
    private JPanel panel1;
    private JButton button1;
    private JTextArea textArea1;
    private JPanel textarea;

    public clientSide() {
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"welcome to second hand book shop");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("second handbook");
        frame.setContentPane(new clientSide().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
