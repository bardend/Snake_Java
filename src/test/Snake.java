package test;

import java.awt.*;
import java.util.ArrayList;
import java.awt.Rectangle;
public class Snake {
    private ArrayList<Rectangle>body;
    private int w = Game.width;
    private int h = Game.height;
    private int d = Game.dimension;
    private String move;

    public Snake() {
        body = new ArrayList<>();

        Rectangle temp = new Rectangle(d, d);
        temp.setLocation(w * d / 2, h * d / 2);
        body.add(temp);
        temp = new Rectangle(d, d);
        temp.setLocation((w / 2 - 1) * d, h * d / 2);
        body.add(temp);
        temp.setLocation((w / 2 - 2) * d, h * d / 2);
        body.add(temp);
        move = "NOTHING";
    }
    public ArrayList<Rectangle> getBody() {
        return body;
    }
    public void setBody (ArrayList <Rectangle> body) {
        this.body = body;
    }
    public void up () {move = "UP";}
    public void down () {move = "DOWN";}
    public void left () {move = "LEFT";}
    public void right () {move = "RIGHT";}

}