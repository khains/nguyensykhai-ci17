package program;

import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    BufferedImage backgroundImage;
    BufferedImage playerImage;
    int playerX;
    int playerY;
    int backgroudX;
    int backgroundY;


    public GamePanel(){
        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
        playerX = 300;
        playerY = 300;
        backgroudX = 0;
        backgroundY = - 2509;

    }

    @Override
    public void paint(Graphics g) {
        g.drawImage(backgroundImage, backgroudX, backgroundY, null);
        g.drawImage(playerImage, playerX, playerY, null);
    }

    public void runAll(){
        // backgroound.run()
        backgroundY+=5;
        if (backgroundY >=0) {
            backgroundY=0;
        }

        // player.run()
        if(GameWindow.isUpPress){
            playerY--;
            if(playerY <= 0){
                playerY++;
            }
        }
        if(GameWindow.isDownPress){
            playerY++;
            if (playerY >= 600 - 48*2){
                playerY--;
            }
        }
        if(GameWindow.isRightPress){
            playerX++;
            if (playerX >= 384 - 32){
                playerX--;
            }
        }
        if(GameWindow.isLeftPress){
            playerX--;
            if (playerX <= 0){
                playerX++;
            }
        }
    }

    public void gameLoop(){
        long lastTime = 0;
        while(true){
            long currentTime = System.currentTimeMillis();
            if(currentTime - lastTime >= 1000 / 60){
//                System.out.println(currentTime - lastTime);
                this.repaint();// render anh
                this.runAll();// chay logic
                lastTime = currentTime;
            }
        }
    }
}
