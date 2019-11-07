package simpleGUI;

import javax.swing.JButton;

public class CreateGUI {
    public static void main(String[] args) {
        JButton button = new JButton();
        
        FrameManager newFrame = new FrameManager(500, 500, "New GUI");
        newFrame.createFrame();
        newFrame.createPanel();
        newFrame.createButton(button, "Button1");
    }
}