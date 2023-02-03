package com.Siuzby;

import javax.swing.*;
import java.awt.*;

public class FoodOrderingPanel extends AppTemplatePanel{

    FoodOrderingPanel(){

        JLabel selectCheese = new JLabel("Select cheese");
        JLabel selectSize = new JLabel("Select size");
        JLabel selectPizzaVariant = new JLabel("Select Your pizza:");

        selectPizzaVariant.setBounds(50,180,200,20);
        selectPizzaVariant.setForeground(Color.WHITE);
        selectPizzaVariant.setFont(new Font("Segoe Print",Font.ITALIC, 16));

        selectSize.setBounds(50,240,200,20);
        selectSize.setForeground(Color.WHITE);
        selectSize.setFont(new Font("Segoe Print",Font.ITALIC, 16));

        selectCheese.setBounds(50,300,200,20);
        selectCheese.setForeground(Color.WHITE);
        selectCheese.setFont(new Font("Segoe Print",Font.ITALIC, 16));

        this.setVisible(false);

        JLabel label = new JLabel();
        label.setBounds(640,300,1280,100);
        label.setText("THIS IS FOOD ORDERING PANEL");
        label.setFont(new Font("Comic Sans", Font.BOLD, 30));
        this.add(selectPizzaVariant);
        this.add(selectCheese);
        this.add(selectSize);
        this.add(label);

    }
}
