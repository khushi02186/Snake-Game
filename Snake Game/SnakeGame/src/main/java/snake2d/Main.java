package snake2d;
import javax.swing.*;
import java.awt.*;


public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame ("Snake Game");
        frame.setBounds (10, 10, 905,700);
        frame.setResizable (false);
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

        GamePanel p=new GamePanel();
        p.setBackground(Color.darkGray);
        frame.add(p);
        frame.setVisible (true);
    }
}
