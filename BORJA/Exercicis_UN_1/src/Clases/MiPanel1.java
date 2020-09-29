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
public class MiPanel1 extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        Color c = new Color(180, 10, 120);
        Color c2 = new Color(120, 10, 120);
        Color c3 = new Color(10, 100, 230);
        
        g.setColor(c);
        g.drawLine(50, 600, 50, 200);
        
        g.setColor(c2);
        g.drawLine(400, 600, 400, 450);
        
        g.setColor(c3);
        g.drawLine(750, 600, 750, 150);
    }   
}
    

