import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;

public class CarEmporiumWindow {

	public JFrame carEmporiumframe;
	public JButton carEntryButton = new JButton("Car Entry");
	public JButton carDisplayButton = new JButton("Car Display");
	public JButton exitButton = new JButton("Exit");

	/**
	 * Launch the application.
	 */
	
	/**
	 * Create the application.
	 */
	public CarEmporiumWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		carEmporiumframe = new JFrame();
		carEmporiumframe.setTitle("Car Emporium");
		carEmporiumframe.setBounds(100, 100, 450, 153);
		carEmporiumframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carEmporiumframe.getContentPane().setLayout(null);
		

		carEntryButton.setBounds(68, 43, 117, 29);
		carEmporiumframe.getContentPane().add(carEntryButton);
		

		carDisplayButton.setBounds(244, 43, 117, 29);
		carEmporiumframe.getContentPane().add(carDisplayButton);
		exitButton.setBounds(163, 84, 117, 29);
		
		carEmporiumframe.getContentPane().add(exitButton);
	}
}
