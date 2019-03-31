package program;

import tklibs.Mathx;
import tklibs.SpriteUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class GamePanel extends JPanel {
    Player player;
    Background background;

//    BufferedImage backgroundImage;
//    BufferedImage playerImage;
//    int playerX;
//    int playerY;
//    int backgroudX;
//    int backgroundY;


    public GamePanel(){
//        backgroundImage = SpriteUtils.loadImage("assets/images/background/0.png");
//        playerImage = SpriteUtils.loadImage("assets/images/players/straight/0.png");
//        playerX = 300;
//        playerY = 300;
//        backgroudX = 0;
//        backgroundY = - 2509;

        player = new Player();
        background = new Background();

    }

    @Override
    public void paint(Graphics g) {
//        g.drawImage(backgroundImage, backgroudX, backgroundY, null);
//        g.drawImage(playerImage, playerX, playerY, null);
        background.render(g);
        player.render(g);

    }

    public void runAll(){
        // backgroound.run()
        background.run();

//        backgroundY+=5;
//        if (backgroundY >=0) {
//            backgroundY=0;
//        }

        // player.run()

        player.run();

//        double playerSpeed = 5;
//        double vx = 0;
//        double vy = 0;
//
//        if(GameWindow.isUpPress){
//            vy-= playerSpeed;
////            if(playerY <= 0){
////                playerY++;
////            }
//        }
//        if(GameWindow.isDownPress){
//            vy+= playerSpeed;
////            if (playerY >= 600 - 48*2){
////                playerY--;
////            }
//        }
//        if(GameWindow.isRightPress){
//            vx+= playerSpeed;
////            if (playerX >= 384 - 32){
////                playerX--;
////            }
//        }
//        if(GameWindow.isLeftPress){
//            vx-= playerSpeed;
////            if (playerX <= 0){
////                playerX++;
////            }
//        }
//        // TODO
//        if (vx != 0 && vy != 0){
//            double v = playerSpeed / Math.sqrt(2);
//            vx = Math.signum(vx) * v;
//            vy = Math.signum(vy) * v;
//        }
//        playerX += vx;
//        playerY += vy;
//
//        // di chuyen trong man hinh
//        playerX = Mathx.clamp(playerX, 0, 384 - 32);
//        playerY = Mathx.clamp(playerY, 0, 600 - 48);

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
