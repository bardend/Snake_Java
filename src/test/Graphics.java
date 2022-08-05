package test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Graphics extends JPanel implements ActionListener {
    private  Timer  t = new Timer(100,this);
    public String state ;
    private Snake s;
    private Food f;
    private Game game;

    public Graphics(Game g){
        t.start();
        state = "Start";
        game = g;
        s = g.getPlayer();
        f = g.getFood();
        //add a keyListener(g);
        this.addKeyListener(g);
        this.setFocusable(true);
        this.setFocusTraversalKeysEnabled(false);
    }
    public void paintComponent(java.awt.Graphics g){
        super.paintComponent(g);
        Graphics2D g2D = (Graphics2D) g;

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
