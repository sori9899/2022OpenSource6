import javax.swing.*;
import java.awt.*;

public class ColorFrameEx extends JFrame {
    public ColorFrameEx(){
        setTitle("4X4 Color Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();

        c.setLayout(new GridLayout(4,4,0,0));

        Color[] col= {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN,
                Color.CYAN, Color.BLUE, Color.MAGENTA, Color.GRAY,
                Color.PINK, Color.LIGHT_GRAY, Color.RED, Color.ORANGE,
                Color.YELLOW, Color.GREEN, Color.CYAN, Color.BLUE};

        for(int i=0; i<16; i++){
            JLabel label = new JLabel(i+"");
            label.setBackground(col[i]);
            label.setOpaque(true);
            c.add(label);
        }


        setSize(500,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ColorFrameEx();
    }
}
