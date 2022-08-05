package test;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Game implements KeyListener {

    private Snake player;
    private Food food;
    private Graphics graphics;
    private JFrame window;
    public static final int width = 30;
    public static final int height = 30;
    public static final int dimension = 20;

    public Game() {
        window = new JFrame();
        window.setTitle("Snake");
        window.setSize(width * dimension, height * dimension);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //Cada vez que presiono una tecla llamara a esta funcion :)
        int keyCode = e.getKeyCode();
        if (keyCode == KeyEvent.VK_W) {
            player.up();
        } else if (keyCode == KeyEvent.VK_S) {
            player.down();
        } else if (keyCode == KeyEvent.VK_A) {
            player.left();
        } else if (keyCode == KeyEvent.VK_D) {
            player.right();
        }
    }

    public Snake getPlayer() {
        return player;
    }

    public void setPlayer(Snake player) {
        this.player = player;
    }

    public Food getFood() {
        return food;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public JFrame getWindow() {
        return window;
    }

    public void setWindow(JFrame window) {
        this.window = window;
    }
}
