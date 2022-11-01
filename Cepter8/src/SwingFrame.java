import javax.swing.*;

public class SwingFrame extends JFrame {
    public SwingFrame(){
        setTitle("Let\'s study java");
        setSize(400,200);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingFrame frame = new SwingFrame();
    }
}
