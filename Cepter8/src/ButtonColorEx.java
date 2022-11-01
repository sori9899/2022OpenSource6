import javax.swing.*;
import java.awt.*;

public class ButtonColorEx extends JFrame {

    public ButtonColorEx(){
        setTitle("Ten Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new GridLayout(1,10));

        c.add(new JButton("0")).setBackground(Color.RED);
        c.add(new JButton("1")).setBackground(Color.ORANGE);
        c.add(new JButton("2")).setBackground(Color.yellow);
        c.add(new JButton("3")).setBackground(Color.green);
        c.add(new JButton("4")).setBackground(Color.CYAN);
        c.add(new JButton("5")).setBackground(Color.BLUE);
        c.add(new JButton("6")).setBackground(Color.MAGENTA);
        c.add(new JButton("7")).setBackground(Color.DARK_GRAY);
        c.add(new JButton("8")).setBackground(Color.PINK);
        c.add(new JButton("9")).setBackground(Color.gray);

        setSize(500,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ButtonColorEx();
    }
}
