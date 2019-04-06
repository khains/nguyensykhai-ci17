package program;

import java.awt.*;
import java.awt.image.BufferedImage;

public class GameObject {
    public BufferedImage image;
    public Vector2D position;
    public Vector2D velocity;

    public GameObject(){
        position = new Vector2D();
        velocity = new Vector2D();
    }

    public void render(Graphics g){
        if (image != null){
            g.drawImage(image, (int)position.x, (int)position.y, null);

        }
    }
    public void run(){
        position.add(velocity);
        //
    }
}
