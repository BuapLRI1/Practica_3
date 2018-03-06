package midibujo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MiDibujo extends JFrame{
private MiPanel panel;
private Punto p;
private Hilo1 t;
private Hilo2 t2;

    MiDibujo(){
        setSize(400,400);
        panel = new MiPanel();
        p = new Punto();
        p.setPos(new Point(0,0));
        t = new Hilo1(p,panel);
        t2 = new Hilo2 (p, panel);
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(panel);
        t.start();
        t2.start();
    }
    
    public static void main(String[] args) {
        MiDibujo fr = new MiDibujo();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
