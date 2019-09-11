package swingcalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class OperationMain {

	static double val1, val2;
	static String inputVal1;
	static String inputVal2;
	static char operation;
	
	//class constructor 
	@SuppressWarnings("static-access")
	public OperationMain(double val1, double val2) {
		this.val1 = val1; this.val2 = val2;
	}

	void inputVal1() {
		inputVal1 = JOptionPane.showInputDialog("Input your first number:");
		System.out.println(inputVal1);

		//parse inputVal1 to integer value
		val1 = Integer.parseInt(inputVal1);
	} 

	void inputVal2() {
		inputVal2 = JOptionPane.showInputDialog("Input your second number:");
		System.out.println(inputVal2);

		//parse inputVal2 to integer value
		val2 = Integer.parseInt(inputVal2);
	}

	//main operation switch
	char operation() {
		//did not define what character was before running switch
		switch(operation) {
		case '+' : FrameCreator.plus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(val1 + val2);
			}

		});
		break;

		case '-': FrameCreator.minus.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(val1 + (-val2));
			}

		});
		break;

		case '*': FrameCreator.times.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(val1 * val2);
			}

		});

		break;

		case '/': FrameCreator.dividedBy.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println(val1 / val2);
			}

		});

		} return operation;
	}



	public static void main(String[] args) {

		FrameCreator.main(args);

		OperationMain operate = new OperationMain(val1, val2);
		operate.inputVal1();
		operate.inputVal2();
		operate.operation();


	}

}
