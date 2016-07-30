/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sal
 */

import java.io.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;


public class GUI {
    
    private static Border defaultBorder = BorderFactory.createEmptyBorder(5,5,5,5);
    private static int defaultTextFieldSize = 10;
    
    public static void main(String[] args){
        GUI gui = new GUI();
        gui.displayGUI();
    }
    
    public void createTextPanel(JPanel textPanel){
        GridBagConstraints textConstaints = new GridBagConstraints();
        
        textConstaints.fill = GridBagConstraints.HORIZONTAL; //Unsure of purpose
        textConstaints.ipadx = 0;
        textConstaints.ipady = 0;
        
        JTextField jtf = new JTextField(10);
        textConstaints.gridx = 0;
        textConstaints.gridy = 0;
        textPanel.add(jtf,textConstaints);
        
        JTextField jtf1 = new JTextField(10);
        textConstaints.gridx = 0;
        textConstaints.gridy = 1;
        textPanel.add(jtf1,textConstaints);
        
        JTextField jtf2 = new JTextField(10);
        textConstaints.gridx = 0;
        textConstaints.gridy = 2;
        textPanel.add(jtf2,textConstaints);
    }
    
    public void createLabelPanel(JPanel labelPanel){
        GridBagConstraints labelConstaints = new GridBagConstraints();
        labelConstaints.fill = GridBagConstraints.HORIZONTAL; //Unsure of purpose
        labelConstaints.ipadx = 0;
        labelConstaints.ipady = 0;
        
        JLabel label = new JLabel("Label 1");
        labelConstaints.gridx = 0;
        labelConstaints.gridy = 0;
        labelPanel.add(label, labelConstaints);
        
        JLabel label2 = new JLabel("Label 2");
        labelConstaints.gridx = 0;
        labelConstaints.gridy = 1;
        labelPanel.add(label2, labelConstaints);
        
        JLabel label3 = new JLabel("Label 3");
        labelConstaints.gridx = 0;
        labelConstaints.gridy = 2;
        labelPanel.add(label3, labelConstaints);
    }
    
    public void displayGUI(){
        JFrame frame = new JFrame("AWESOME BUDGET APP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel mainPanel = new JPanel(new GridBagLayout());
        JPanel textPanel = new JPanel(new GridBagLayout());
        JPanel labelPanel = new JPanel(new GridBagLayout());
        
        createTextPanel(textPanel);
        createLabelPanel(labelPanel);
        
        GridBagConstraints mainConstraints = new GridBagConstraints();
        

        

        
        mainConstraints.fill = GridBagConstraints.HORIZONTAL;
        mainConstraints.ipadx = 10;
        mainConstraints.ipady = 10;
        

        
        mainConstraints.gridx = 0;
        mainConstraints.gridy = 0;
        mainPanel.add(labelPanel, mainConstraints);
        
        mainConstraints.gridx = 1;
        mainConstraints.gridy = 0;
        mainPanel.add(textPanel, mainConstraints);
        
        frame.add(mainPanel);
        frame.pack();
        frame.setVisible(true);
        
    }
    
}
