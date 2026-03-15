package com.bank.ui.panels;

import javax.swing.*;
import java.awt.*;

public class DepositoPanel extends JPanel {

    public DepositoPanel(){

        setLayout(new GridLayout(4,2,10,10));

        JTextField cuenta = new JTextField();
        JTextField monto = new JTextField();

        JButton depositar = new JButton("Realizar Deposito");

        depositar.addActionListener(e -> {

            JOptionPane.showMessageDialog(null,
                    "Deposito realizado correctamente");

        });

        add(new JLabel("Numero Cuenta"));
        add(cuenta);

        add(new JLabel("Monto"));
        add(monto);

        add(new JLabel());
        add(depositar);

    }

}