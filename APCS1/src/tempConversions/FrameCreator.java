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

    JButton convertFtoC = new JButton("F. --> C.");
    JButton convertCtoF = new JButton("C. --> F.");

    public static JTextField entryField = new JTextField("Conversion Value?");

    public void makeFrame() {
        JFrame frame = new JFrame(name);
        frame.setSize(200, 200);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel.add(convertFtoC);
        panel.add(convertCtoF);
        panel.add(entryField);

        convertFtoC.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                Converter action = new Converter(Double.parseDouble(entryField.getText()));
                action.FtoCconvert();
            }
        });

        convertCtoF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Converter action2 = new Converter(Double.parseDouble(entryField.getText()));
                action2.CtoFConvert();
            }
        });

        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

}