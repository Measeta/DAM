/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis;

import Clases.MiPanel3;
import javax.swing.JFrame;



/**
 *
 * @author alumne
 */
public class Exercici_3 extends JFrame{
    public Exercici_3(){
       super("Parábolas");
       MiPanel3 MiPanel = new MiPanel3();
        add(MiPanel);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        Exercici_3 frame = new Exercici_3();
    }   
    
    
}
