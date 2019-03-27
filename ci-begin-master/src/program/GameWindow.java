package program;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class GameWindow extends JFrame {
    public static boolean isUpPress;
    public static boolean isDownPress;
    public static boolean isRightPress;
    public static boolean isLeftPress;

    public GameWindow(){
        this.setTitle("Game Touhou");
        this.setSize(800, 600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setResizable(false);
        //key
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                //ham dc goi khi giu phim
//                System.out.println(e.getKeyChar());// lay ki tu phim
//                System.out.println(e.getKeyCode());// lay ma cua phim
                if(e.getKeyCode() == KeyEvent.VK_W){
                    isUpPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    isDownPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_A){
                    isLeftPress = true;
                }
                if(e.getKeyCode() == KeyEvent.VK_D){
                    isRightPress = true;
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                // ham dc goi khi nha phim
                if(e.getKeyCode() == KeyEvent.VK_W){
                    isUpPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_S){
                    isDownPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_A){
                    isLeftPress = false;
                }
                if(e.getKeyCode() == KeyEvent.VK_D){
                    isRightPress = false;
                }
            }
        });
        //mouse
    }
}
