package com.Siuzby;

import javax.swing.*;
import java.awt.*;

public class AppTemplatePanel extends JPanel {

    AppTemplatePanel(){
        JLabel topsideLogotype = new JLabel();
        ImageIcon pizzeriaLogo = new ImageIcon("FakePizzaLogotype.png");

        topsideLogotype.setIcon(pizzeriaLogo);
        topsideLogotype.setVisible(true);
        topsideLogotype.setBounds(0,0,1280,100);

        this.setSize(1280,720);
        this.setBackground(Color.BLACK);
        this.setLayout(null);
        this.add(topsideLogotype);


    }
}
