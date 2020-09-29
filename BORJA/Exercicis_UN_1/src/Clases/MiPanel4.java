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
public class MiPanel4 extends JPanel{
    int ANCHO = getWidth();
    int LARGO= getHeight();
    int escala=50;
    @Override
    public void paintComponent(Graphics g){
        
        Color c1 = new Color(100, 200, 0);
        
        for(double i=-ANCHO;i<ANCHO;i++){
            double a= Math.toRadians((i/100)*180);
            double b= Math.abs(Math.cos(a));
            
            int x= (int)a;
            int y= (int)b*escala;
            
           g.setColor(c1); 
           g.fillOval(x, (int) b+50, 20, 20);
        }
        
        
    
    }
    
}