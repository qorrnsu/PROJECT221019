import java.awt.*;
import javax.swing.*;

class MyFrame3 extends JFrame{
    public MyFrame3() {
        Color color[]= {Color.RED,Color.ORANGE,Color.YELLOW,Color.GREEN,Color.CYAN,Color.BLUE,
                Color.magenta,Color.GRAY,Color.PINK,Color.LIGHT_GRAY};

        setTitle("Ten Color Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));


        for(int i = 0; i < 10; i++) {
            JLabel l = new JLabel(Integer.toString(i), SwingConstants.CENTER);
            l.setBackground(color[i]);
            l.setOpaque(true);
            c.add(l);
        }

        setSize(500,200);
        setVisible(true);
    }
}


public class Practice {
    public static void main(String[] args) {
        new MyFrame3();
    }
}

