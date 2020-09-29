/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis;

import Clases.MiPanel5;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author alumne
 */


public class Exercici_5 extends JFrame{
    
    public Exercici_5(){
        super("Casa de campo");
        MiPanel5 MiPanel = new MiPanel5();
        add(MiPanel);
        setSize(600, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args){
        Exercici_5 frame = new Exercici_5();
    }   
    
    
}
