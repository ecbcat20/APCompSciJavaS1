package simpleGUI;

public class CreateGUI {
    public static void main(String[] args) {
        FrameManager newFrame = new FrameManager(500, 500, "New GUI");
        newFrame.createFrame();
        newFrame.createElements();

    }
}