package swingcalculator;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class FrameCreator {

	//create frame, panel, and calculator buttons
	static JFrame calculator = new JFrame ("Simple Java Calculator");
	static JPanel calcPanel = new JPanel();
	static JButton plus = new JButton("+");
	static JButton minus = new JButton("-");
	static JButton times = new JButton("*");
	static JButton dividedBy = new JButton("/");
	
	public static void createFrame() {
		//create calculator frame
		calculator.setSize(100, 400);
		calcPanel.add(plus);
		calcPanel.add(minus);
		calcPanel.add(times);
		calcPanel.add(dividedBy);
		calculator.add(calcPanel);
		calcPanel.setVisible(true);
		calculator.setVisible(true);
	}
	
	
	public static void main(String[] args) {

		createFrame();
	}

}
