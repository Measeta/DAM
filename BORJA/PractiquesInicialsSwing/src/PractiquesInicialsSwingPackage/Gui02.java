/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PractiquesInicialsSwingPackage;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author alumne
 */
public class Gui02 extends JFrame{
    
    public Gui02(){
        super("Ejemplo de Layout");
        
        //Configurar componentes;
        //Configurar Layout
        
        setLayout(new FlowLayout(FlowLayout.LEFT, 10, 20));
        for(int i = 1; i<=10; i++)
            add(new JButton("Componente " + i));
        setSize(310,310);//pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main (String args[]){
        
        Gui02 aplicacion = new Gui02();
        
    }
    
}
