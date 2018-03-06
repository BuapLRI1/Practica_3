package misnodos;
import javax.swing.*;
import java.awt.*;

public class MisNodos extends JFrame{
    private MiPanel panel;
    public MisNodos(){
        setSize(400,400);
        MisObjetos();
    }
    
    private void MisObjetos(){
        panel = new MiPanel();
        getContentPane().setLayout(new GridLayout());
        getContentPane().add(panel);
    }
    
    public static void main(String[] args) {
        MisNodos fr = new MisNodos();
        fr.setVisible(true);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
