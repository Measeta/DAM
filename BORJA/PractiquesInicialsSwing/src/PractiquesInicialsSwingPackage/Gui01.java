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
public class Gui01 extends JFrame{
    private final Container panel;
    private final JButton miboton;
    
    /*
    
    // Ejemplo utilizando herencia
    
    public Gui01(){
        super("Ejemplo 01 con botón");
        
        //Configurar componentes
        
        //miboton = new JButton("Aceptar");
        //panel = getContentPane();
        //panel.add(miboton);
        
        //Omitir las linias de asignación al contenedor
        
        miboton = new JButton("Aceptar");
        add(miboton);
        
        
        setSize(200,100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    */
    
    //Ejemplo sin utilizar la herencia
    
    public Gui01(){
        JFrame frame = new JFrame("Ejemplo 01");
        panel = frame.getContentPane();
        
        miboton = new JButton("Aceptar");
        panel.add(miboton);
        
        // se añade al contentPane del frame
        
        frame.pack(); //--> ADAPTA EL TAMAÑO DE LA VENTANA AL CONTENIDO
        frame.setVisible(true); //--> HACE VISIBLE LA VENTANA
        frame.setLocationRelativeTo(null);//-->CENTRAR LA VENTANA EN LA PANTALLA
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
    
    public static void main (String args[]){
        
        Gui01 aplicacion = new Gui01();
        
    }
    
}
