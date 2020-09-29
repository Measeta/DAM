package PractiquesInicialsSwingPackage;
import javax.swing.*;
import java.awt.*;

class MiPanel2 extends JPanel{
    @Override
    public void paintComponent(Graphics g){
        Color c = new Color(180, 10, 120);
        g.setColor(c);
        g.drawString("Dibujar en el panel", 90, 90);
        g.fillOval(1, 1, 90, 90);
    }
}
public class Gui06 extends JFrame{
    public Gui06(){
        super("Ejemplo de dibujo");
        add(new MiPanel2());
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    
    public static void main(String[] args){
        Gui06 frame = new Gui06();
    }
    
}