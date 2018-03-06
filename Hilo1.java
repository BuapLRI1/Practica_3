package midibujo;
import javax.swing.*;
import java.awt.*;

public class Hilo1 extends Thread {
    private Punto pos;
    private MiPanel panel;
    
    public Hilo1(Punto pos, MiPanel panel){
        this.pos = pos;
        this.panel = panel;
    }
    public void run(){
        while(true){
            Point p = pos.getPos();
            int x = (int)p.getX();
            int y = (int)p.getY();
        
            p.setLocation(x+10,y+10);
            
            pos.setPos(p);
            panel.repintar(pos);
            
            try{
                sleep(100);
            }catch(Exception e){}
        }
    }
}
