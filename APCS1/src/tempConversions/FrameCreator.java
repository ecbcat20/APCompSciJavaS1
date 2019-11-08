package tempConversions;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameCreator implements ActionListener {

    private String name;

    public FrameCreator(String name) {
        this.name = name;
    }

    public void makeFrame() {
        JFrame frame = new JFrame(name);
        frame.setSize(200, 100);

        JPanel panel = new JPanel();
        JButton convert = new JButton("Convert");
        JTextField entryField = new JTextField("Enter Value to Convert");

        panel.add(convert);
        panel.add(entryField);

        frame.add(panel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


    }

}