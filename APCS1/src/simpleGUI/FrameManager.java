package simpleGUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FrameManager implements ActionListener {
    private int xdim, ydim;
    private String windowName;
    public JFrame frame;

    public int count;

    // default constructor
    public FrameManager(int xdim, int ydim, String windowName) {
        this.xdim = xdim;
        this.ydim = ydim;
        this.windowName = windowName;
    }

    public void createPanel() { // utility method
        JPanel panel = new JPanel();
        frame.add(panel);
    }

    public void createElements() { // called first
        frame.setLayout(null);
        JButton hello = new JButton();

        hello.setText("Hello, World!");

        hello.setSize(500, 500);

        frame.add(hello);
        hello.addActionListener((ActionListener) this);
        System.out.println("Buttons added to frame");

        frame.setVisible(true);
    }

    public void createFrame() { // called first
        frame = new JFrame(windowName);
        frame.setSize(xdim, ydim);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Button Clicked. ");
        count++;
        System.out.println(count);
    }

}