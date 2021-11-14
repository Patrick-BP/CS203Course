package CarGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class addCarWindow {

	public static JFrame addCarWindowFrame;
	public JTextField makeText;
	public JTextField modelText;
	public JTextField yearText;
	public JButton exitButton = new JButton("Exit");
	public JButton addButton = new JButton("Add Car");
	public JButton showCarsButton = new JButton("Show Cars");
	/**
	 * Create the application.
	 */
	public addCarWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addCarWindowFrame = new JFrame();
		addCarWindowFrame.setResizable(false);
		addCarWindowFrame.setBounds(100, 100, 450, 300);
		addCarWindowFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addCarWindowFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblNewLabel = new JLabel("Make");
		addCarWindowFrame.getContentPane().add(lblNewLabel);
		
		makeText = new JTextField();
		addCarWindowFrame.getContentPane().add(makeText);
		makeText.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Model");
		addCarWindowFrame.getContentPane().add(lblNewLabel_1);
		
		modelText = new JTextField();
		addCarWindowFrame.getContentPane().add(modelText);
		modelText.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year");
		addCarWindowFrame.getContentPane().add(lblNewLabel_2);
		
		yearText = new JTextField();
		addCarWindowFrame.getContentPane().add(yearText);
		yearText.setColumns(10);
		
		
		addCarWindowFrame.getContentPane().add(exitButton);
		
		
		addCarWindowFrame.getContentPane().add(addButton);
		
		addCarWindowFrame.getContentPane().add(showCarsButton);
	}

}
