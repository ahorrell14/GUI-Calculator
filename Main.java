/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itsc1213guilab;

import javax.swing.JFrame;

/**
 *
 * @author skyehorrell
 */
public class Main {

    public static void main(String[] args) {
        
        //Create CalculatorGUI object
        CalculatorGUI myFrame = new CalculatorGUI();
        
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.pack();
        myFrame.setVisible(true);
    }
    
}
