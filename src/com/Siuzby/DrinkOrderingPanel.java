package com.Siuzby;

import javax.swing.*;
import java.awt.*;

public class DrinkOrderingPanel extends AppTemplatePanel{
    DrinkOrderingPanel(){
        this.setVisible(false);


        JLabel label = new JLabel();

        label.setBounds(640,300,1280,100);
        label.setText("THIS IS DRINK ORDERING PANEL");
        label.setFont(new Font("Comic Sans", Font.BOLD, 30));

        this.add(label);
    }
}
