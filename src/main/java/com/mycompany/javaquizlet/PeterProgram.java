/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.javaquizlet;

import javax.swing.JFrame;

/**
 *
 * @author everettmiller
 */
public class PeterProgram {

    //Git is used for major updates - sidnote for future Everett
    
    public static void Calculator_Window(){
                // Create a JFrame (the window)
        JFrame frame = new JFrame("My Window");

        // Set the size of the window (width, height)
        frame.setSize(400, 300);

        // Set the default close operation (what happens when you click the 'X')
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the window visible
        frame.setVisible(true);
    
   
    
    
    }
    
    
    
    
    
    
    
    public static void main(String[] args) {
        Calculator_Window();
    }
}
