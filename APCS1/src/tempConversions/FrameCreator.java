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

    JPanel panel = new JPanel();
    JButton convert = new JButton("Convert");
    public static JTextField entryField = new JTextField("Enter Value to Convert");

    public void makeFrame() {
        JFrame frame = new JFrame(name);
        frame.setSize(200, 100);

        panel.add(convert);
        panel.add(entryField);

        convert.addActionListener(this);

        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Converter action = new Converter(Double.parseDouble(entryField.getText()));
        action.convert();
    }

}