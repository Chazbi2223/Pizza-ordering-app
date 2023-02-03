package com.Siuzby;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.TimerTask;

public class AppBodyFrame extends JFrame implements ActionListener {

    JComboBox pizzaVariantSelection;
    ButtonGroup cheeseSelection;
    JRadioButton cheeseSelectionClassic;
    JRadioButton cheeseSelectionDouble;
    JRadioButton cheeseSelectionVegan;
    ButtonGroup pizzaSizeSelection;
    JRadioButton pizzaSizeSelectionNormal;
    JRadioButton pizzaSizeSelectionLarge;
    JRadioButton pizzaSizeSelectionFamily;
    JRadioButton cheeseSelectionVeganDouble;
    ButtonTemplate makeOrderButton;
    ButtonTemplate returnToWelcomeScreen;
    ButtonTemplate goToDrinksScreen;
    ButtonTemplate returnToFoodScreen;
    ButtonTemplate goToSummary;
    ButtonTemplate addPizzaToOrder;
    JTextArea orderViewer;
    AppWelcomePanel welcomePanel;
    FoodOrderingPanel foodOrderingPanel;
    DrinkOrderingPanel drinkOrderingPanel;
    SummaryPanel summaryPanel;

    AppBodyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280,720);

        //Below are instantiated panels user will navigate through.

        welcomePanel = new AppWelcomePanel();
        foodOrderingPanel = new FoodOrderingPanel();
        drinkOrderingPanel = new DrinkOrderingPanel();
        summaryPanel = new SummaryPanel();

        //Below elements of the gui user will use for navigation through app and ordering.

        makeOrderButton = new ButtonTemplate();
        makeOrderButton.setBounds(540,325,200,40);
        makeOrderButton.setText("Make an order!");
        makeOrderButton.addActionListener(this);
        makeOrderButton.setVisible(true);

        returnToWelcomeScreen = new ButtonTemplate();
        returnToWelcomeScreen.setBounds(10,630,100,40);
        returnToWelcomeScreen.setText("Cancel");
        returnToWelcomeScreen.addActionListener(this);

        goToDrinksScreen = new ButtonTemplate();
        goToDrinksScreen.setBounds(1105,630,150,40);
        goToDrinksScreen.setText("Go to drink menu");
        goToDrinksScreen.addActionListener(this);

        returnToFoodScreen = new ButtonTemplate();
        returnToFoodScreen.setBounds(955,630,150,40);
        returnToFoodScreen.setText("Return to dish menu");
        returnToFoodScreen.addActionListener(this);

        goToSummary = new ButtonTemplate();
        goToSummary.setBounds(1105,630,150,40);
        goToSummary.setText("Summary");
        goToSummary.addActionListener(this);

        String[] pizzaVariants = {
        "Margherita","Salame","Prosciutto","Diavolo","Spinaci","Pratiolo","Vege","Vicenza"};
        pizzaVariantSelection = new JComboBox(pizzaVariants);
        pizzaVariantSelection.setBounds(50,200,150,20);
        pizzaVariantSelection.setBackground(Color.BLACK);
        pizzaVariantSelection.setForeground(Color.WHITE);
        pizzaVariantSelection.setVisible(false);


        cheeseSelection = new ButtonGroup();
        cheeseSelectionClassic = new JRadioButton("Classic");
        cheeseSelectionDouble =  new JRadioButton("Double");
        cheeseSelectionVegan = new JRadioButton("Vegan");
        cheeseSelectionVeganDouble = new JRadioButton("Vegan Double");
        cheeseSelectionClassic.setBounds(50,320,100,20);
        cheeseSelectionClassic.setName("Classic");
        cheeseSelectionDouble.setBounds(150,320,100,20);
        cheeseSelectionVegan.setBounds(250,320,100,20);
        cheeseSelectionVeganDouble.setBounds(350,320,130,20);
        cheeseSelectionClassic.setBackground(Color.BLACK);
        cheeseSelectionDouble.setBackground(Color.BLACK);
        cheeseSelectionVegan.setBackground(Color.BLACK);
        cheeseSelectionVeganDouble.setBackground(Color.BLACK);
        cheeseSelectionClassic.setForeground(Color.WHITE);
        cheeseSelectionDouble.setForeground(Color.WHITE);
        cheeseSelectionVegan.setForeground(Color.WHITE);
        cheeseSelectionVeganDouble.setForeground(Color.WHITE);
        cheeseSelection.add(cheeseSelectionClassic);
        cheeseSelection.add(cheeseSelectionDouble);
        cheeseSelection.add(cheeseSelectionVegan);
        cheeseSelection.add(cheeseSelectionVeganDouble);
        cheeseSelectionClassic.setVisible(false);
        cheeseSelectionDouble.setVisible(false);
        cheeseSelectionVegan.setVisible(false);
        cheeseSelectionVeganDouble.setVisible(false);
        cheeseSelectionClassic.setSelected(true);

        pizzaSizeSelection = new ButtonGroup();
        pizzaSizeSelectionNormal = new JRadioButton("Normal 30cm");
        pizzaSizeSelectionLarge =  new JRadioButton("Large 42cm");
        pizzaSizeSelectionFamily = new JRadioButton("Family 55cm");
        pizzaSizeSelectionNormal.setBounds(50,260,105,20);
        pizzaSizeSelectionLarge.setBounds(150,260,100,20);
        pizzaSizeSelectionFamily.setBounds(250,260,100,20);

        pizzaSizeSelectionNormal.setBackground(Color.BLACK);
        pizzaSizeSelectionLarge.setBackground(Color.BLACK);
        pizzaSizeSelectionFamily.setBackground(Color.BLACK);

        pizzaSizeSelectionNormal.setForeground(Color.WHITE);
        pizzaSizeSelectionLarge.setForeground(Color.WHITE);
        pizzaSizeSelectionFamily.setForeground(Color.WHITE);

        pizzaSizeSelection.add(pizzaSizeSelectionNormal);
        pizzaSizeSelection.add(pizzaSizeSelectionLarge);
        pizzaSizeSelection.add(pizzaSizeSelectionFamily);

        pizzaSizeSelectionNormal.setVisible(false);
        pizzaSizeSelectionLarge.setVisible(false);
        pizzaSizeSelectionFamily.setVisible(false);
        pizzaSizeSelectionNormal.setSelected(true);

        addPizzaToOrder = new ButtonTemplate();
        addPizzaToOrder.setBounds(600,200,120,40);
        addPizzaToOrder.setText("Add to order");
        addPizzaToOrder.addActionListener(this);


        orderViewer = new JTextArea();
        orderViewer.setBounds(800, 200,400,400);
        orderViewer.setText("Your order:");
        orderViewer.setBackground(new Color(20,20,20));
        orderViewer.setForeground(Color.WHITE);
        orderViewer.setEditable(false);
        orderViewer.setVisible(false);

        this.add(makeOrderButton);
        this.add(goToSummary);
        this.add(returnToWelcomeScreen);
        this.add(goToDrinksScreen);
        this.add(returnToFoodScreen);
        this.add(pizzaVariantSelection);
        this.add(cheeseSelectionClassic);
        this.add(cheeseSelectionDouble);
        this.add(cheeseSelectionVegan);
        this.add(cheeseSelectionVeganDouble);
        this.add(pizzaSizeSelectionNormal);
        this.add(pizzaSizeSelectionLarge);
        this.add(pizzaSizeSelectionFamily);
        this.add(addPizzaToOrder);
        this.add(orderViewer);
        this.add(welcomePanel);
        this.add(foodOrderingPanel);
        this.add(drinkOrderingPanel);
        this.add(summaryPanel);
        this.setResizable(false);
        this.setVisible(true);
        this.setLayout(null);



    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==makeOrderButton){
            welcomePanel.setVisible(false);
            makeOrderButton.setVisible(false);
            returnToWelcomeScreen.setVisible(true);
            goToDrinksScreen.setVisible(true);
            foodOrderingPanel.setVisible(true);
            cheeseSelectionClassic.setVisible(true);
            cheeseSelectionDouble.setVisible(true);
            cheeseSelectionVegan.setVisible(true);
            cheeseSelectionVeganDouble.setVisible(true);
            pizzaSizeSelectionNormal.setVisible(true);
            pizzaSizeSelectionLarge.setVisible(true);
            pizzaSizeSelectionFamily.setVisible(true);
            pizzaVariantSelection.setVisible(true);
            orderViewer.setVisible(true);
            addPizzaToOrder.setVisible(true);

        }
        if (e.getSource()==returnToWelcomeScreen) {
            foodOrderingPanel.setVisible(false);
            drinkOrderingPanel.setVisible(false);
            welcomePanel.setVisible(true);
            returnToWelcomeScreen.setVisible(false);
            makeOrderButton.setVisible(true);
            goToDrinksScreen.setVisible(false);
            returnToFoodScreen.setVisible(false);
            goToSummary.setVisible(false);
            cheeseSelectionClassic.setVisible(false);
            cheeseSelectionDouble.setVisible(false);
            cheeseSelectionVegan.setVisible(false);
            cheeseSelectionVeganDouble.setVisible(false);
            pizzaSizeSelectionNormal.setVisible(false);
            pizzaSizeSelectionLarge.setVisible(false);
            pizzaSizeSelectionFamily.setVisible(false);
            pizzaVariantSelection.setVisible(false);
            orderViewer.setVisible(false);
            addPizzaToOrder.setVisible(false);




        }
        if (e.getSource()==goToDrinksScreen){
            foodOrderingPanel.setVisible(false);
            drinkOrderingPanel.setVisible(true);
            goToDrinksScreen.setVisible(false);
            returnToFoodScreen.setVisible(true);
            goToSummary.setVisible(true);
            cheeseSelectionClassic.setVisible(false);
            cheeseSelectionDouble.setVisible(false);
            cheeseSelectionVegan.setVisible(false);
            cheeseSelectionVeganDouble.setVisible(false);
            pizzaSizeSelectionNormal.setVisible(false);
            pizzaSizeSelectionLarge.setVisible(false);
            pizzaSizeSelectionFamily.setVisible(false);
            pizzaVariantSelection.setVisible(false);
            addPizzaToOrder.setVisible(false);

        }
        if (e.getSource()==returnToFoodScreen) {
            foodOrderingPanel.setVisible(true);
            drinkOrderingPanel.setVisible(false);
            goToDrinksScreen.setVisible(true);
            returnToFoodScreen.setVisible(false);
            goToSummary.setVisible(false);
            cheeseSelectionClassic.setVisible(true);
            cheeseSelectionDouble.setVisible(true);
            cheeseSelectionVegan.setVisible(true);
            cheeseSelectionVeganDouble.setVisible(true);
            pizzaSizeSelectionNormal.setVisible(true);
            pizzaSizeSelectionLarge.setVisible(true);
            pizzaSizeSelectionFamily.setVisible(true);
            addPizzaToOrder.setVisible(true);
            pizzaVariantSelection.setVisible(true);

        }
        if (e.getSource()==goToSummary) {

            drinkOrderingPanel.setVisible(false);
            summaryPanel.setVisible(true);
            goToSummary.setVisible(false);
            cheeseSelectionClassic.setVisible(false);
            cheeseSelectionDouble.setVisible(false);
            cheeseSelectionVegan.setVisible(false);
            cheeseSelectionVeganDouble.setVisible(false);
            pizzaSizeSelectionNormal.setVisible(false);
            pizzaSizeSelectionLarge.setVisible(false);
            pizzaSizeSelectionFamily.setVisible(false);
            pizzaVariantSelection.setVisible(false);
            pizzaVariantSelection.setVisible(false);
            orderViewer.setVisible(false);
            addPizzaToOrder.setVisible(false);
            returnToWelcomeScreen.setVisible(false);
            returnToFoodScreen.setVisible(false);


        }

        if(e.getSource()==addPizzaToOrder) {

            orderViewer.setText(orderViewer.getText() +"\n" + pizzaVariantSelection.getSelectedItem().toString());
            if (pizzaSizeSelectionNormal.isSelected()){
                orderViewer.setText(orderViewer.getText() + ", normal");
            }
            if (pizzaSizeSelectionLarge.isSelected()){
                orderViewer.setText(orderViewer.getText() + ", large");
            }
            if (pizzaSizeSelectionFamily.isSelected()){
                orderViewer.setText(orderViewer.getText() + ", family");
            }
            if (cheeseSelectionClassic.isSelected()) {
                orderViewer.setText(orderViewer.getText() + ", normal cheese");
            }
            if (cheeseSelectionDouble.isSelected()) {
                orderViewer.setText(orderViewer.getText() + ", double cheese");
            }
            if (cheeseSelectionVegan.isSelected()) {
                orderViewer.setText(orderViewer.getText() + ", vegan cheese");
            }
            if (cheeseSelectionVeganDouble.isSelected()) {
                orderViewer.setText(orderViewer.getText() + ", double vegan cheese");
            }

        }


    }
}
