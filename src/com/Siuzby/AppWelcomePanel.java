package com.Siuzby;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWelcomePanel extends AppTemplatePanel {



    AppWelcomePanel(){

        JLabel welcomeSign = new JLabel();

        welcomeSign.setText("WELCOME! Please press the button below to make Your order!");
        welcomeSign.setBounds(350,300,1280,20);
        welcomeSign.setForeground(Color.WHITE);
        welcomeSign.setFont(new Font("Segoe Print",Font.ITALIC,18));
        welcomeSign.setVisible(true);

        this.add(welcomeSign);
        this.setVisible(true);
    }


}
