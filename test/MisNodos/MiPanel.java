package misnodos;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;
import java.util.ArrayList;

public class MiPanel extends JPanel{
    private ArrayList<Ellipse2D> nodos;
    
    public MiPanel(){
        nodos = new ArrayList<Ellipse2D>();
        addMouseListener(new MouseAdapter(){
            public void mouseClicked(MouseEvent evento){
                nodos.add(new Ellipse2D.Double(evento.getX(),evento.getY(),20,20));
                repaint();
            }
        });
        addMouseMotionListener(new MouseMotionAdapter(){
            public void mouseDragged(MouseEvent e){
//                nodos.contains(e);
                  System.out.println(e.getX()+","+e.getY());
                  repaint();
            }
            public void mouseMoved(MouseEvent e2){
                if(nodos.contains(e2))
                        System.out.println(e2.getX()+","+e2.getY());
            }
        });
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
//        g2.fill(new Ellipse2D.Double(70,100,25,25));
    for(int i=0;i<nodos.size();i++){
        g2.fill((Ellipse2D)(nodos.get(i)));
    }
    }
}
