import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class CarsDisplayWindow {

	public JFrame CarDisplayframe;
	public JButton returnButton = new JButton("Return");
	public JTextArea carsDisplytextArea = new JTextArea();
	public JButton exitButton = new JButton("Exit");

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public CarsDisplayWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		CarDisplayframe = new JFrame();
		CarDisplayframe.setTitle("Car Emporium -Car Display");
		CarDisplayframe.setResizable(false);
		CarDisplayframe.setBounds(100, 100, 741, 240);
		CarDisplayframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		CarDisplayframe.getContentPane().setLayout(null);
		

		returnButton.setBounds(6, 169, 117, 29);
		CarDisplayframe.getContentPane().add(returnButton);
		

		carsDisplytextArea.setEditable(false);
		carsDisplytextArea.setBounds(19, 19, 716, 138);
		CarDisplayframe.getContentPane().add(carsDisplytextArea);
		exitButton.setBounds(135, 169, 117, 29);
		
		CarDisplayframe.getContentPane().add(exitButton);
	}
}
