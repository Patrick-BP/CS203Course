package LibraryApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginWindow {

	public JFrame loginWindowframe;
	public JTextField usernametextField;
	public JTextField passwordtextField;
	public JButton loginButton = new JButton("Login");
	 

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public LoginWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		loginWindowframe = new JFrame();
		loginWindowframe.setTitle("Login");
		loginWindowframe.setResizable(false);
		loginWindowframe.setBounds(100, 100, 368, 172);
		loginWindowframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		loginWindowframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(28, 20, 61, 23);
		loginWindowframe.getContentPane().add(lblNewLabel);
		
		usernametextField = new JTextField();
		usernametextField.setBounds(117, 21, 165, 20);
		loginWindowframe.getContentPane().add(usernametextField);
		usernametextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(28, 66, 61, 17);
		loginWindowframe.getContentPane().add(lblNewLabel_1);
		
		passwordtextField = new JTextField();
		passwordtextField.setBounds(117, 64, 165, 20);
		loginWindowframe.getContentPane().add(passwordtextField);
		passwordtextField.setColumns(10);
		
		
		loginButton.setBounds(157, 95, 89, 23);
		loginWindowframe.getContentPane().add(loginButton);
	}
}
