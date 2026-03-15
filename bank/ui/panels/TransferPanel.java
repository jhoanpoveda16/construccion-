package com.bank.ui.panels;

import javax.swing.*;
import java.awt.*;

public class TransferPanel extends JPanel {

    public TransferPanel(){

        setLayout(new GridLayout(5,2,10,10));

        JTextField origen = new JTextField();
        JTextField destino = new JTextField();
        JTextField monto = new JTextField();

        JButton transferir = new JButton("Realizar Transferencia");

        transferir.addActionListener(e -> {

            JOptionPane.showMessageDialog(null,
                    "Transferencia realizada");

        });

        add(new JLabel("Cuenta Origen"));
        add(origen);

        add(new JLabel("Cuenta Destino"));
        add(destino);

        add(new JLabel("Monto"));
        add(monto);

        add(new JLabel());
        add(transferir);

    }

}