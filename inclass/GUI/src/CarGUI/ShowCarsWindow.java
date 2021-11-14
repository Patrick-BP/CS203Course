package CarGUI;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class ShowCarsWindow {

	public JFrame ShowCarsFrame;
	public JTextArea carDisplayTextArea = new JTextArea();
	public JButton exitButton = new JButton("Exit");
	public JButton backButton = new JButton("Back");

	/**
	 * Create the application.
	 */
	public ShowCarsWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ShowCarsFrame = new JFrame();
		ShowCarsFrame.setResizable(false);
		ShowCarsFrame.setBounds(100, 100, 450, 300);
		ShowCarsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ShowCarsFrame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		ShowCarsFrame.setTitle("Cars");
		
		carDisplayTextArea.setEditable(false);
		ShowCarsFrame.getContentPane().add(carDisplayTextArea);
		
		ShowCarsFrame.getContentPane().add(exitButton);
		
		ShowCarsFrame.getContentPane().add(backButton);
	}

}
