/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicis;

import Clases.MiPanel2;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

/**
 *
 * @author alumne
 */



public class Exercici_2 extends JFrame{
    public Exercici_2(){
        super("Gráfico");
        MiPanel2 MiPanel = new MiPanel2();
        add(MiPanel);
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args){
        Exercici_2 frame = new Exercici_2();
    }
        
}