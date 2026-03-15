package com.bank.ui;

import javax.swing.*;
import java.awt.*;

public class LoginFrame extends JFrame {

    JTextField userField;
    JPasswordField passField;

    public LoginFrame(){

        setTitle("Bank System - Login");
        setSize(400,300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(5,1,10,10));

        JLabel title = new JLabel("BANK SYSTEM",SwingConstants.CENTER);

        userField = new JTextField();
        passField = new JPasswordField();

        JButton loginBtn = new JButton("Login");

        loginBtn.addActionListener(e -> login());

        panel.add(title);
        panel.add(new JLabel("Usuario"));
        panel.add(userField);
        panel.add(new JLabel("Contraseña"));
        panel.add(passField);
        panel.add(loginBtn);

        add(panel);

    }

    private void login(){

        BancoDashboard dashboard = new BancoDashboard();
        dashboard.setVisible(true);

        dispose();

    }

}