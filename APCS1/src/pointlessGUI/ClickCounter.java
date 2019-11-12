package pointlessGUI;

import javax.swing.*;
import java.awt.event.*;

public class ClickCounter implements ActionListener {

    int num = 0;
    JFrame frame = new JFrame("Click Counter Application");
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Button has been clicked " + num + " of Times.");
    JButton clickme = new JButton("Click Me!");

    public ClickCounter() {

    }

    public void buildFrame() {
        frame.setSize(100, 200);
        panel.add(clickme);
        panel.add(label);
        panel.setVisible(true);
    }

    public void setCounter() {

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}