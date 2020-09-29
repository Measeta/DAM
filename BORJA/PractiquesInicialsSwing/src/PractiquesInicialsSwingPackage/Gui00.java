/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiquesInicialsSwingPackage;

import javax.swing.*;

/**
 *
 * @author alumne
 */
public class Gui00{
    public Gui00(){
        
        JFrame frame = new JFrame("Ejemplo 00");
        
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(200,100);
        
    }
    
    public static void main (String args[]){
        Gui00 aplicacion = new Gui00();
    }
    
    
    
}
