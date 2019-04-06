package program.player;

import program.GameObject;
import program.GameWindow;
import program.Vector2D;
import tklibs.Mathx;
import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Player extends GameObject {
//    BufferedImage image;
//    Vector2D position;

    ArrayList<PlayerBullet> bullets;

    public Player() {
        image = SpriteUtils.loadImage("assets/images/players/straight/0.png");
//        position = new Vector2D(300, 300);
        position.set(300, 300);

        bullets = new ArrayList<>();
    }

    public void render(Graphics g) {
//        g.drawImage(image, (int)position.x, (int)position.y, null);
        super.render(g);

        for (int i = 0; i < bullets.size(); i ++){
            PlayerBullet bullet = bullets.get(i);
            bullet.render(g);
        }
    }

    public void run() {
        super.run();
        this.move();
        this.limitPosition();
        this.bulletsRun();
        this.fire();
    }

    int count = 0;
    public void fire() {
        count++;
        if(GameWindow.isFirePress && count > 20) {

//            PlayerBullet bullet = new PlayerBullet();
//            bullet.position.set(this.position.x, this.position.y);
//            bullets.add(bullet);
//
//            PlayerBullet bullet2 = new PlayerBullet();
//            bullet2.position.set(this.position.x - 10, this.position.y);
//            bullet2.velocity.setAngle(-Math.PI / 3); //(Math.toRadian(-60))
//            bullets.add(bullet2);
//
//            PlayerBullet bullet3 = new PlayerBullet();
//            bullet3.position.set(this.position.x + 10, this.position.y);
//            bullet3.velocity.setAngle(-2 * Math.PI / 3);
//            bullets.add(bullet3);

            double fromX = this.position.x + 10;
            double toX = this.position.x - 10;
            double fromAngle = -Math.PI / 3;
            double toAngle = -2 * Math.PI / 3;
            int numberBullet = 20;
            for (int i = 0; i < numberBullet; i++){
                PlayerBullet bullet = new PlayerBullet();

                double x = fromX + i * (toX - fromX) / (numberBullet - 1);
                bullet.position.set(x, this.position.y);

                double angle = fromAngle + i * (toAngle - fromAngle) / (numberBullet - 1);
                bullet.velocity.setAngle(angle);

                bullets.add(bullet);
            }

            count = 0;
        }
    }

    public void bulletsRun() {
//
        for (int i = 0; i < bullets.size(); i++){
            PlayerBullet bullet = bullets.get(i);
            bullet.run();
        }
    }

    public void move() {
        double playerSpeed = 3;
        double vx = 0;
        double vy = 0;

        if(GameWindow.isUpPress) {
            vy -= playerSpeed;
        }
        if(GameWindow.isRightPress) {
            vx += playerSpeed;
        }
        if(GameWindow.isDownPress) {
            vy += playerSpeed;
        }
        if(GameWindow.isLeftPress) {
            vx -= playerSpeed;
        }

        if(vx != 0 && vy != 0) {
            double v = playerSpeed / Math.sqrt(2);
            vx = Math.signum(vx) * v; // 1 * 5 * sqrt(2)
            vy = Math.signum(vy) * v; // -1 * 5 * sqrt(2)
        }

        position.add(vx, vy);
    }

    public void limitPosition() {
        position.setX(Mathx.clamp(position.x, 0, 384 - 32));
        position.setY(Mathx.clamp(position.y, 0, 600 - 48));
    }
}
