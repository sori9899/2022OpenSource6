import javax.swing.*;
import java.awt.*;

public class CalcEx extends JFrame {
    public CalcEx(){

        setTitle("계산기 프레임");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        JPanel top = new JPanel();
        JPanel center = new JPanel();
        JPanel bottom = new JPanel();

        top.setBackground(Color.LIGHT_GRAY);
        center.setLayout(new GridLayout(4,4));
        bottom.setBackground(Color.YELLOW);

        c.add(top, BorderLayout.NORTH);
        c.add(center);
        c.add(bottom, BorderLayout.SOUTH);

        JLabel label1 = new JLabel("수신입력");
        JTextField  textField1= new JTextField(10);
        top.add(label1);
        top.add(textField1);

        JLabel label2 = new JLabel("계산결과");
        JTextField textField2 = new JTextField(10);
        bottom.add(label2);
        bottom.add(textField2);

        for(int i=0; i<16; i++){
            JButton button = new JButton();
            String[] str = {"CE", "Enter", "+", "-", "x","/"};
            center.add(button);
            if(i<10){
                button.setText(i+"");
            }else{
                button.setText(str[i-10]);
            }
            if(i>11){
                button.setOpaque(true);
            }
        }

        setSize(400,400);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CalcEx();
    }


}
