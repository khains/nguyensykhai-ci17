package program;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background {
    BufferedImage image;
    int x;
    int y;
    public Background(){
        image = SpriteUtils.loadImage("assets/images/background/0.png");
        x = 0;
        y = - 2509;
    }
    public void render(Graphics g){
        g.drawImage(image, x, y, null );

    }
    public void run(){
        y += 5;
        if(y >= 0){
            y = 0;
        }
    }
}
