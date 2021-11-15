package LibraryApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;

public class AddMemberWindow {

	public JFrame addMemberframe;
	public JTextField memberIdtextField;
	public JTextField phoneNumtextField;
	public JTextField nametextField;
	public JTextField emailtextField;
	public JButton backNewButton = new JButton("Back");

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public AddMemberWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addMemberframe = new JFrame();
		addMemberframe.setTitle("Add New Member");
		addMemberframe.setBounds(100, 100, 450, 300);
		addMemberframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addMemberframe.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Member ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(52, 47, 89, 14);
		addMemberframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(52, 72, 46, 14);
		addMemberframe.getContentPane().add(lblNewLabel_1);
		
		JLabel emaillblNewLabel = new JLabel("Email Address");
		emaillblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		emaillblNewLabel.setBounds(52, 124, 89, 14);
		addMemberframe.getContentPane().add(emaillblNewLabel);
		
		JLabel lblNewLabel_3 = new JLabel("Phone Number");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(52, 97, 89, 14);
		addMemberframe.getContentPane().add(lblNewLabel_3);
		
		memberIdtextField = new JTextField();
		memberIdtextField.setBounds(151, 44, 139, 20);
		addMemberframe.getContentPane().add(memberIdtextField);
		memberIdtextField.setColumns(10);
		
		phoneNumtextField = new JTextField();
		phoneNumtextField.setBounds(151, 94, 139, 20);
		addMemberframe.getContentPane().add(phoneNumtextField);
		phoneNumtextField.setColumns(10);
		
		nametextField = new JTextField();
		nametextField.setBounds(151, 69, 139, 20);
		addMemberframe.getContentPane().add(nametextField);
		nametextField.setColumns(10);
		
		emailtextField = new JTextField();
		emailtextField.setBounds(151, 121, 139, 20);
		addMemberframe.getContentPane().add(emailtextField);
		emailtextField.setColumns(10);
		
		JButton addnewmemberNewButton = new JButton("Add  Member");
		addnewmemberNewButton.setBounds(55, 216, 107, 23);
		addMemberframe.getContentPane().add(addnewmemberNewButton);
		
		JButton cancelNewButton = new JButton("Cancel");
		cancelNewButton.setBounds(191, 216, 89, 23);
		addMemberframe.getContentPane().add(cancelNewButton);
		
		
		backNewButton.setBounds(305, 216, 89, 23);
		addMemberframe.getContentPane().add(backNewButton);
		
		JComboBox categorycomboBox = new JComboBox();
		categorycomboBox.setModel(new DefaultComboBoxModel(new String[] {"Student Member", "Library Member", "Factulty Member"}));
		categorycomboBox.setBounds(151, 163, 139, 22);
		addMemberframe.getContentPane().add(categorycomboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Category");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(52, 167, 77, 14);
		addMemberframe.getContentPane().add(lblNewLabel_4);
	}
}
