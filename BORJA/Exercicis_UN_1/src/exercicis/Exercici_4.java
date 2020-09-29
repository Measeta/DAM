/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis;


import Clases.MiPanel4;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author alumne
 */



public class Exercici_4 extends JFrame{
    public Exercici_4(){
        super("Parábolas");
        MiPanel4 MiPanel = new MiPanel4();
        add(MiPanel);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
    }
    
    public static void main(String[] args){
        Exercici_4 frame = new Exercici_4();
    }   
    
    
}
