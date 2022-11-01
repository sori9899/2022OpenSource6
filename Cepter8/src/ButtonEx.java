import javax.swing.*;
import java.awt.*;

public class ButtonEx extends JFrame {

    public ButtonEx(){
        setTitle("Ten Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new GridLayout(1,10));

        c.add(new JButton("0"));
        c.add(new JButton("1"));
        c.add(new JButton("2"));
        c.add(new JButton("3"));
        c.add(new JButton("4"));
        c.add(new JButton("5"));
        c.add(new JButton("6"));
        c.add(new JButton("7"));
        c.add(new JButton("8"));
        c.add(new JButton("9"));

        setSize(500,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonEx();
    }
}
