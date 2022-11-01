import javax.swing.*;
import java.awt.*;

public class RandomEx extends JFrame {
    public RandomEx(){
        setTitle("Random Labels");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        JLabel[] label = new JLabel[20];

        for(int i=0; i<20; i++){
            label[i] = new JLabel("");
            int x = (int)(Math.random()*200) +50 ;
            int y = (int)(Math.random()*200)+50;
            label[i].setSize(10,10);
            label[i].setLocation(x,y);
            label[i].setOpaque(true);
            label[i].setBackground(Color.blue);
            add(label[i]);
        }
        setSize(300,300);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RandomEx();
    }
}
