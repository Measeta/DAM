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

public class MiPanel5 extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        
        Color tejado = new Color(251, 11, 11);
        Color vegetacion = new Color(17, 249, 24);
        Color arbol = new Color(161, 108, 16);
        Color sol = new Color(255, 249, 51);
        Color black =new Color(0, 0, 0);
        Color humo =new Color(206, 206, 206);
        
        //Casa
        //Tejado
        g.setColor(tejado);
        g.drawLine(80, 100, 150, 100);
        g.drawLine(80, 100, 250, 50);
        g.drawLine(250, 50, 300, 70);
        g.drawLine(300, 70, 300, 50);
        g.drawLine(300, 50, 320, 50);
        g.drawLine(300, 70, 300, 50);
        g.drawLine(320, 50, 320, 80);
        g.drawLine(320, 80, 370, 100);
        g.drawLine(370, 100, 320, 100);
        
        
        //Humo
        g.setColor(humo);
        g.drawOval(310, 30, 10, 10);
        g.drawOval(290, 20, 15, 15);
        g.drawOval(265, 10, 20, 20);
        g.drawOval(310, 30, 10, 10);
        
        //Paredes,ventanas y puertas.
        g.setColor(black);
        g.drawLine(150, 100, 150, 300);
        g.drawLine(320, 100, 320, 300);
        g.drawLine(200, 300, 200, 220);
        g.drawLine(200, 300, 230, 320);
        g.drawLine(200, 220, 230, 240);
        g.drawLine(230, 240, 230, 320);
        g.drawOval(220, 280, 5, 5);
        g.drawLine(200, 220, 250, 220);
        g.drawLine(250, 220, 250, 300);
        g.drawLine(250, 220, 250, 300);
        
        
        g.drawLine(160, 120, 160, 150);
        g.drawLine(160, 120, 190, 120);
        g.drawLine(160, 150, 190, 150);
        g.drawLine(190, 150, 190, 120);
        g.drawLine(160, 135, 190, 135);
        g.drawLine(175, 150, 175, 120);
        
        
        
        g.drawLine(280, 120, 280, 150);
        g.drawLine(280, 120, 310, 120);
        g.drawLine(280, 150, 310, 150);
        g.drawLine(310, 150, 310, 120);
        g.drawLine(280, 135, 310, 135);
        g.drawLine(295, 150, 295, 120);
        
        g.setColor(vegetacion);
        g.drawLine(0, 300, 200, 300);
        
        //Arbol
        g.setColor(vegetacion);
        g.drawLine(250, 300, 420, 300);
        g.drawLine(450, 300, 700, 300);
        g.setColor(arbol);
        g.drawLine(420, 300, 420, 215);
        g.drawLine(450, 300, 450, 215);
        
        
        g.setColor(vegetacion);
        g.drawOval(410, 170, 50, 50);
        g.drawOval(360, 160, 70, 70);
        g.drawOval(440, 160, 70, 70);
        g.drawOval(400, 120, 70, 70);
        
        
        //Sol
        g.setColor(sol);
        g.drawOval(500, 20, 90, 90);
        g.drawOval(520, 40, 20, 20);
        g.drawOval(550, 40, 20, 20);
        g.setColor(black);
        g.fillOval(527, 47, 5, 5);
        g.fillOval(557, 47, 5, 5);
        
        g.setColor(tejado);
        g.drawLine(430, 10, 490, 30);
        g.drawLine(430, 50, 490, 50);
        g.drawLine(430, 90, 490, 70);
        
    }
    
}