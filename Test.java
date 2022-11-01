import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel {
    public NorthPanel() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new FlowLayout());
        add(new JButton("Open"));
        add(new JButton("Read"));
        add(new JButton("Close"));
    }

}

class CenterPanel extends JPanel {
    public CenterPanel() {
        setLayout(null);
        JLabel lLabel = new JLabel("LOVE");
        JLabel hLabel = new JLabel("Hello");
        JLabel jLabel = new JLabel("Java");

        lLabel.setBounds(200, 150, 50, 20);
        hLabel.setBounds(100, 10, 50, 20);
        jLabel.setBounds(20, 200, 50, 20);

        add(lLabel);
        add(hLabel);
        add(jLabel);
    }
}


public class Test extends JFrame {
    Test() {
        setTitle("SwingApp");
        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        NorthPanel NPan = new NorthPanel();
        CenterPanel CPan = new CenterPanel();

        add(NPan, BorderLayout.NORTH);
        add(CPan, BorderLayout.CENTER);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Test();
    }
}

