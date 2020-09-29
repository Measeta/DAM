/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author alumne
 */

public class MiPanel2 extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        
        Color c = new Color(180, 10, 120);
        Color c2 = new Color(120, 10, 120);
        Color c3 = new Color(10, 100, 230);
        
        
        
        g.setColor(c);
        g.fillRect(250, 150, 5, 50);
        
        g.setColor(c2);
        g.fillRect(150, 100, 5, 70);
        
        g.setColor(c3);
        g.fillRect(50, 70, 5, 100);
    }   
}