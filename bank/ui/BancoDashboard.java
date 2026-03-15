package com.bank.ui;

import javax.swing.*;
import java.awt.*;
import com.bank.ui.panels.*;

public class BancoDashboard extends JFrame {

    JPanel mainPanel;

    public BancoDashboard(){

        setTitle("Bank Dashboard");
        setSize(800,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel menu = new JPanel();
        menu.setLayout(new GridLayout(4,1));

        JButton depositBtn = new JButton("Depositar");
        JButton retiroBtn = new JButton("Retirar");
        JButton transferBtn = new JButton("Transferir");

        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        depositBtn.addActionListener(e -> cargarPanel(new DepositoPanel()));
        retiroBtn.addActionListener(e -> cargarPanel(new RetiroPanel()));
        transferBtn.addActionListener(e -> cargarPanel(new TransferPanel()));

        menu.add(depositBtn);
        menu.add(retiroBtn);
        menu.add(transferBtn);

        add(menu,BorderLayout.WEST);
        add(mainPanel,BorderLayout.CENTER);

    }

    private void cargarPanel(JPanel panel){

        mainPanel.removeAll();
        mainPanel.add(panel);
        mainPanel.repaint();
        mainPanel.revalidate();

    }

}