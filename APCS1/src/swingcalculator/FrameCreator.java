package swingcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
	
	public static void listenForOperation() {
		FrameCreator.plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OperationMain.operation = '+';
			}

		});

		FrameCreator.minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OperationMain.operation = '-';
			}

		});

		FrameCreator.times.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OperationMain.operation = '*';
			}

		});

		FrameCreator.dividedBy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				OperationMain.operation = '/';
			}

		});
	}
	
	public static void main(String[] args) {

		createFrame();
		listenForOperation();
	}

}
