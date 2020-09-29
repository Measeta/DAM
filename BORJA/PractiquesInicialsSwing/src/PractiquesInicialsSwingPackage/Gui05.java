package PractiquesInicialsSwingPackage;

import javax.swing.*;
import java.awt.*;

class MiPanel extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Interfaz Gráfica", 40, 40);
    }
}
public class Gui05 extends JFrame{
    public Gui05(){
        super("Ejemplo de dibujo");
        add(new MiPanel());
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args){
        Gui05 frame = new Gui05();
    }
    
}
