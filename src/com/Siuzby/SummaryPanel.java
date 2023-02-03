package com.Siuzby;

import javax.swing.*;
import java.awt.*;

public class SummaryPanel extends AppTemplatePanel {
    SummaryPanel(){
        this.setVisible(false);
        ImageIcon chefPicture = new ImageIcon("pizzaChefSummaryScreen.png");
        JLabel thankYouText = new JLabel();
        thankYouText.setBounds(330,220,1280,720);
        thankYouText.setVerticalTextPosition(JLabel.TOP);
        thankYouText.setHorizontalTextPosition(0);
        thankYouText.setForeground(Color.WHITE);
        thankYouText.setFont(new Font("Segoe Print", Font.ITALIC, 30));
        thankYouText.setText("Thank You! Your order is being prepared!");
        thankYouText.setIcon(chefPicture);
        this.add(thankYouText);
    }
}
