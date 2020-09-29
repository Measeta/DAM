/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis;

import Clases.MiPanel1;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author alumne
 */



public class Exercici_1 extends JFrame{
    public Exercici_1(){
        super("Gráfico");
        MiPanel1 MiPanel = new MiPanel1();
        
        
        add(MiPanel);
        setSize(800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        Exercici_1 frame = new Exercici_1();
    }
        
}