package program;

import javax.swing.*;
import java.awt.*;

public class Program {
    public static void main(String[] args) {
        GameWindow window = new GameWindow();



        GamePanel panel = new GamePanel();
        window.add(panel);
        panel.setBackground(Color.CYAN);

        window.setVisible(true);

        panel.gameLoop();
    }
}
