import javax.swing.*;
import java.awt.*;

public class Panels extends JFrame {
    class NorthPanel extends JPanel{
        public NorthPanel(){
            setBackground(Color.LIGHT_GRAY);
            add(new JButton("열기"));
            add(new JButton("닫기"));
            add(new JButton("나가기"));
        }
    }

    class CenterPanel extends JPanel{
        public CenterPanel(){
            setLayout(null);
            JLabel[] labels = new JLabel[10];
            for(int i=0; i<10; i++){
                int x = (int)(Math.random()*250);
                int y = (int)(Math.random()*250);
                labels[i] = new JLabel("*");
                labels[i].setForeground(Color.RED);
                labels[i].setLocation(x,y);
                labels[i].setSize(20, 20);
                labels[i].setOpaque(true);
                add(labels[i]);
            }
        }
    }

    class SouthPanel extends JPanel{
        public SouthPanel(){
            setBackground(Color.YELLOW);
            add(new JButton("Word input"));
            add(new JTextField(15));
        }
    }
    public Panels(){
        setTitle("여러 개의 패널을 가진 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NorthPanel northPanel = new NorthPanel();
        SouthPanel southPanel = new SouthPanel();
        CenterPanel centerPanel = new CenterPanel();

        add(northPanel, BorderLayout.NORTH);
        add(centerPanel);
        add(southPanel, BorderLayout.SOUTH);

        setSize(300,300);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Panels();
    }
}
