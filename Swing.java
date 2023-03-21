import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Swing{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("This is for title.");
        frame.setSize(300,300);
        frame.setResizable(false);//frame ko suze fix garxa
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.red);
        frame.setVisible(true);

        JButton button= new JButton("button");
        button.setBounds(100,100,80,80);
        frame.add(button);

    }
}