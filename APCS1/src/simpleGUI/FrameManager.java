package simpleGUI;
import javax.swing.*;

public class FrameManager {
    private int xdim, ydim;
    private String windowName;
    public JFrame frame;
    public JPanel panel;

    public FrameManager(int xdim, int ydim, String windowName) {
        this.xdim = xdim;
        this.ydim = ydim;
        this.windowName = windowName;
    }

    public void createFrame() {
        frame = new JFrame(windowName);
        frame.setSize(xdim, ydim);
        frame.setVisible(true);
    }

    public void createPanel() {
        JPanel panel = new JPanel();
        frame.add(panel);
    }

    public void createButton(JButton x, String alias) {
        x = new JButton();
        x.setName(alias);
        panel.add(x);
    }

    


}