/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213guilab;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author skyehorrell
 */
public class CalculatorGUI extends JFrame implements ActionListener{
    
    //private JLabel field
    private JLabel calculateLabel;
    //private JButton field
    private JButton calculateButton;
    private JButton subButton;
    private JButton multButton;
    private JButton dividButton;
    //private JText Fields
    private JTextField userInputA;
    private JTextField userInputB;
    private JTextField result;
            
    
    CalculatorGUI() {
        
        //Set title
        setTitle("CalculatorGUI");
        
        //set layout of the JFrame to be a new GridBagLayout
        setLayout(new GridBagLayout());
        
        //Create GridBagConstraints
        GridBagConstraints layoutConst = new GridBagConstraints();
        //Set gridX and gridY to 0
        layoutConst.gridx = 0;
        layoutConst.gridy = 0;
        //Set insets to insets object with a padding of 10 on all sides
        layoutConst.insets = new Insets(10, 10, 10, 10);
        
        //Instigate JLabel field with title "Calculate"
        calculateLabel = new JLabel("Calculate");
        //Call add method and add JLabel to calculatorGUI frame
        add(calculateLabel, layoutConst);
        
        //Instigate JButton
        calculateButton = new JButton ("Add");
        subButton = new JButton ("Subract");
        multButton = new JButton ("Multipy");
        dividButton = new JButton ("Divide");
        
        //Specify componenys grid location
        layoutConst.gridx = 0;
        layoutConst.gridy = 2;
        
        //Add button to JFrame
        add(calculateButton, layoutConst);
        
        layoutConst.gridx = 0;
        layoutConst.gridy = 3;
        
        add(subButton, layoutConst);
        
        layoutConst.gridx = 0;
        layoutConst.gridy = 4;
        
        add(multButton, layoutConst);
        
        layoutConst.gridx = 0;
        layoutConst.gridy = 5;
        
        add(dividButton, layoutConst);
        
        //actionPerformed method
        calculateButton.addActionListener(this);
        subButton.addActionListener(new SubtractListener());
        multButton.addActionListener(new MultiplyListener());
        dividButton.addActionListener(new DivideListener());
        
        //Instigate JTextField objects
        userInputA = new JTextField();
        userInputB = new JTextField();
        result = new JTextField();
        
        //Add fields to JFramd and set positions
        layoutConst.gridx = 0;
        layoutConst.gridy = 1;
        add(userInputA, layoutConst);
        
        layoutConst.gridx = 1;
        layoutConst.gridy = 1;
        add(userInputB, layoutConst);
        
        layoutConst.gridx = 1;
        layoutConst.gridy = 2;
        add(result, layoutConst);
        
        //Set prefered sizes for user Inputs and result
        userInputA.setPreferredSize(new Dimension(100, 20));
        userInputA.setMinimumSize(userInputA.getPreferredSize());
        
        userInputB.setPreferredSize(new Dimension(100,20));
        userInputB.setMinimumSize(userInputB.getPreferredSize());
        
        result.setPreferredSize(new Dimension(100, 20));
        result.setMaximumSize(result.getPreferredSize());
    }
    
    public void actionPerformed(ActionEvent e) {
        
        try {
        
            //Change calculate label to button pressed 
            calculateLabel.setText("Button pressed!");
        
            //Get integer values 
            double num1 = Double.parseDouble(userInputA.getText());
            double num2 = Double.parseDouble(userInputB.getText());
        
            //Get sum
            double sum = num1 + num2;
        
            //Assign result with sum total
            String total = Double.toString(sum);
        
            result.setText(total);
            
        } catch (NumberFormatException k){
            
            calculateLabel.setText("Must enter two numeric values!");

        }
        
    }
        
        class SubtractListener implements ActionListener {

            public void actionPerformed(ActionEvent e) {
                
                try {
        
            //Change calculate label to button pressed 
            calculateLabel.setText("Button pressed!");
        
            //Get integer values 
            double num1 = Double.parseDouble(userInputA.getText());
            double num2 = Double.parseDouble(userInputB.getText());
        
            //Get sum
            double sum = num1 - num2;
        
            //Assign result with sum total
            String total = Double.toString(sum);
        
            result.setText(total);
            
        } catch (NumberFormatException k){
            
            calculateLabel.setText("Must enter two numeric values!");

        }
            }
            
        }
        
        class MultiplyListener implements ActionListener {
            
            public void actionPerformed(ActionEvent e) {
                
                try {
        
            //Change calculate label to button pressed 
            calculateLabel.setText("Button pressed!");
        
            //Get integer values 
            double num1 = Double.parseDouble(userInputA.getText());
            double num2 = Double.parseDouble(userInputB.getText());
        
            //Get sum
            double sum = num1 * num2;
        
            //Assign result with sum total
            String total = Double.toString(sum);
        
            result.setText(total);
            
        } catch (NumberFormatException k){
            
            calculateLabel.setText("Must enter two numeric values!");

        }
            }
        }
        
        class DivideListener implements ActionListener {
            
            public void actionPerformed(ActionEvent e) {
                 
                try {
        
            //Change calculate label to button pressed 
            calculateLabel.setText("Button pressed!");
        
            //Get integer values 
            double num1 = Double.parseDouble(userInputA.getText());
            double num2 = Double.parseDouble(userInputB.getText());
        
            //Get sum
            double sum = num1 / num2;
        
            //Assign result with sum total
            String total = Double.toString(sum);
        
            result.setText(total);
            
        } catch (NumberFormatException k){
            
            calculateLabel.setText("Must enter two numeric values!");

        }
         catch (ArithmeticException p) {
             
            calculateLabel.setText("Cannot divide by 0!");
         }
            }
        }
        
    
}
