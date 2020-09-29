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
public class MiPanel3 extends JPanel{
    private int ANCHO,LARGO;
    int escala=50;
    @Override
    public void paintComponent(Graphics g){
        Color c1 = new Color(0, 0, 0);
        Color c2 = new Color(120, 10, 120);
        Color c3 = new Color(10, 100, 230);
        
        ANCHO = getWidth();
        LARGO= getHeight();
        //Dibujamos los ejes
        
        //Eix X
        g.drawLine(0,(LARGO/2), ANCHO, (LARGO/2));
        
        //Eix Y
        
        g.drawLine(ANCHO/2,0,ANCHO/2,LARGO);
        
        //Punt 0,0
        // ANCHO/2, LARGO/2
        
        //Puntos horizontales positivos
        for(int i=0;i<ANCHO/2;i=i+50){
            g.drawLine((ANCHO/2)+i, (LARGO/2)-5, (ANCHO/2)+i, (LARGO/2)+5);
        }
        
        //Puntos horizontales negativos
        for(int i=0;i<ANCHO/2;i=i+50){
            g.drawLine((ANCHO/2)-i, (LARGO/2)-5, (ANCHO/2)-i, (LARGO/2)+5);
        }
        
        //Puntos verticales negativos
        for(int i=0;i<LARGO/2;i=i+50){
            g.drawLine((ANCHO/2)-5, (LARGO/2)+i, (ANCHO/2)+5, (LARGO/2)+i);
        }
        
        //Puntos verticales positivos
        for(int i=0;i<LARGO/2;i=i+50){
            g.drawLine((ANCHO/2)+5, (LARGO/2)-i, (ANCHO/2)-5, (LARGO/2)-i);
        }
        
        double a=-2;
        double b=-4;
        double c=3;
        int y=0;
        int x=0;
        //Dibujar parábola
        
        for(int i=0;i<=ANCHO/2;i++){
            g.drawLine((ANCHO/2), (LARGO/2), (ANCHO/2)+i, (LARGO/2)-i);
        }
        
        
    }  
}
