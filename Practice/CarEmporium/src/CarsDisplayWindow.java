import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import java.awt.TextArea;

public class CarsDisplayWindow {

	public JFrame CarDisplayframe;
	public JButton returnButton = new JButton("Return");
	public JButton exitButton = new JButton("Exit");
	public TextArea carsDisplaytextArea = new TextArea();
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
		exitButton.setBounds(135, 169, 117, 29);
		
		CarDisplayframe.getContentPane().add(exitButton);
		carsDisplaytextArea.setEditable(false);
		
		
		carsDisplaytextArea.setBounds(35, 10, 696, 153);
		CarDisplayframe.getContentPane().add(carsDisplaytextArea);
	}
}
