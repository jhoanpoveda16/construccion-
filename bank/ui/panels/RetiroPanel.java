package com.bank.ui.panels;

import javax.swing.*;
import java.awt.*;

public class RetiroPanel extends JPanel {

    public RetiroPanel(){

        setLayout(new GridLayout(4,2,10,10));

        JTextField cuenta = new JTextField();
        JTextField monto = new JTextField();

        JButton retirar = new JButton("Realizar Retiro");

        retirar.addActionListener(e -> {

            JOptionPane.showMessageDialog(null,
                    "Retiro realizado");

        });

        add(new JLabel("Numero Cuenta"));
        add(cuenta);

        add(new JLabel("Monto"));
        add(monto);

        add(new JLabel());
        add(retirar);

    }

}