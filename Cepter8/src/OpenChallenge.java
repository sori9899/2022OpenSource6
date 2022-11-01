import javax.swing.*;
import java.awt.*;

public class OpenChallenge extends JFrame {

    class NorthPanel extends JPanel{
        public NorthPanel(){
            setBackground(Color.LIGHT_GRAY);
            add(new JButton("Open"));
            add(new JButton("Read"));
            add(new JButton("Close"));
        }
    }

    class CenterPanel extends  JPanel{
        public CenterPanel(){
            setLayout(null);
            String[] str = {"Hello", "Java", "Love"};
            for(int i=0; i<3; i++){
                int x = (int)(Math.random()*200)+50;
                int y = (int)(Math.random()*200)+50;
                JLabel label = new JLabel(str[i]);
                label.setLocation(x,y);
                label.setSize(30,10);
                label.setOpaque(true);
                add(label);
            }

        }
    }

    public OpenChallenge(){
        setTitle("Open Challenge 9");
        setSize(300, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        NorthPanel northPanel = new NorthPanel();
        CenterPanel centerPanel = new CenterPanel();

        add(northPanel, BorderLayout.NORTH);
        add(centerPanel, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new OpenChallenge();
    }
}
