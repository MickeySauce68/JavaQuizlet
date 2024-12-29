/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.peterprogram;

import java.awt.Component;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author everettmiller
 */
public class PeterProgram {

    //Git is used for major updates - sidnote for future Everett
    
    public static void Peter_Window(){
                // Create a JFrame (the window)
        JFrame frame = new JFrame("Peter Alert");
        JButton button = new JButton("Ok");
        
        
        
        
        
        button.addActionListener((ActionEvent e) -> {
            frame.dispose(); // Closes the frame
        });
        
        
        
        frame.add(button);  
        
        
        // Set the size of the window (width, height)
        frame.setSize(400, 300);
        
    
        ImageIcon icon = new ImageIcon("/Users/everettmiller/Desktop/Memes/Peter_Griffin.png");
 
        JLabel label = new JLabel(icon);
 
        
        //Adding Peter Griffin Image
        //frame.add(new JLabel(new ImageIcon("Path/To/Your/Image.png")));
        
        
      
        button.setBounds(150,200,95,30); 
        
        frame.add(label);
        
        // Set the default close operation (what happens when you click the 'X')
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
        
        
        
        
        
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Peter_Window();
        
        
    }

    private static PopupMenu label(ImageIcon icon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private static PopupMenu JLabel(ImageIcon icon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
