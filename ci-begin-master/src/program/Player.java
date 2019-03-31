package program;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Player {
    BufferedImage image;
    double x;
    double y;

    public Player(){
        image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        x = 300;
        y = 300;

    }
    public void render(Graphics g){
        g.drawImage(image, (int)x, (int)y, null);

    }
    public void run(){
        double playerSpeed = 5;
        double vx = 0;
        double vy = 0;

        if(GameWindow.isUpPress){
            vy-= playerSpeed;
//            if(playerY <= 0){
//                playerY++;
//            }
        }
        if(GameWindow.isDownPress){
            vy+= playerSpeed;
//            if (playerY >= 600 - 48*2){
//                playerY--;
//            }
        }
        if(GameWindow.isRightPress){
            vx+= playerSpeed;
//            if (playerX >= 384 - 32){
//                playerX--;
//            }
        }
        if(GameWindow.isLeftPress){
            vx-= playerSpeed;
//            if (playerX <= 0){
//                playerX++;
//            }
        }
        // TODO
        if (vx != 0 && vy != 0){
            double v = playerSpeed / Math.sqrt(2);
            vx = Math.signum(vx) * v;
            vy = Math.signum(vy) * v;
        }
        x += vx;
        y += vy;

        // di chuyen trong man hinh
        x = Mathx.clamp(x, 0, 384 - 32);
        y = Mathx.clamp(y, 0, 600 - 48);
    }
}
