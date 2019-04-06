package program;

import tklibs.SpriteUtils;

import java.awt.*;
import java.awt.image.BufferedImage;

public class Background extends GameObject{
//    BufferedImage image;
//    Vector2D position;
//    Vector2D velocity;


    public Background() {
        image = SpriteUtils.loadImage("assets/images/background/0.png");
//        position = new Vector2D(0, 600 - 3109);
//        velocity = new Vector2D(0, 10);
        position.set(0, 600 - 3109);
        velocity.set(0,10);

    }

    public void render(Graphics g) {
//        g.drawImage(image, (int)position.x, (int)position.y, null);
        super.render(g);
    }

    public void run() {
//        position.add(velocity.x, velocity.y);
        super.run();
        if(position.y >= 0) {
            position.setY(0);
        }
    }
}
