package test;

import java.awt.*;

public class Food {
    private int x;
    private int y;
    public Food(Snake player){
        this.random_spawn(player);
    }
    public void random_spawn(Snake player){
        boolean onSnake = true ;
        while(onSnake){
            x = (int)(Math.random()*Game.width);
            y = (int)(Math.random()*Game.height);
            boolean check = true ;
           for(Rectangle r: player.getBody()){
               if(r.x == x && r.y == y){
                   check = false ;
               }
           }

            if(check == true){
                onSnake = false ;
            }
        }
    }
}