package midibujo;
import java.awt.geom.*;
import javax.swing.*;
import java.awt.*;
        
public class MiPanel extends JPanel{
    private Punto p;
    
    public MiPanel(){
        p = new Punto();
        p.setPos(new Point(0,0));
        
    }
    public void repintar(Punto p){
        this.p = p;
        repaint();
    }
    public Punto getP() {
        return p;
    }
    public void setP(Punto p) {
        this.p = p;
        repaint();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        g2.fill(new Ellipse2D.Double(p.getPos().getX(),p.getPos().getY(),50,50));
    }
}
