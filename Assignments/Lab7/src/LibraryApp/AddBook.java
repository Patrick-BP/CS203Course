package LibraryApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JScrollBar;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.Box;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.JTextArea;

public class AddBook {

	public JFrame addbookframe;
	public JTextField bookidtextField;
	public JTextField booknametextField;
	public JTextField bookeditiontextField;
	public JTextField bookPublishertextField;
	public JButton backButton = new JButton("Back");
	public JButton addbookButton = new JButton("Add Book");
	public  JComboBox bookCategorycomboBox = new JComboBox();
	public JTextField bookgenretextField;
	public JTextField qtytextField;
	public JTextArea  bookListtextArea;

	
	public AddBook() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		addbookframe = new JFrame();
		addbookframe.setTitle("Add Book Window");
		addbookframe.setBounds(100, 100, 884, 489);
		addbookframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		addbookframe.getContentPane().setLayout(null);
		
		
		bookCategorycomboBox.setModel(new DefaultComboBoxModel(new String[] {"Books", "Magazines", "CDs"}));
		bookCategorycomboBox.setBounds(102, 258, 178, 22);
		addbookframe.getContentPane().add(bookCategorycomboBox);
		
		JLabel lblNewLabel = new JLabel("Book ID");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel.setBounds(30, 70, 63, 22);
		addbookframe.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_1.setBounds(30, 118, 63, 14);
		addbookframe.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Edition");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_2.setBounds(30, 162, 63, 14);
		addbookframe.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Publisher");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(30, 208, 63, 14);
		addbookframe.getContentPane().add(lblNewLabel_3);
		
		bookidtextField = new JTextField();
		bookidtextField.setBounds(102, 71, 178, 20);
		addbookframe.getContentPane().add(bookidtextField);
		bookidtextField.setColumns(10);
		
		booknametextField = new JTextField();
		booknametextField.setBounds(103, 115, 177, 20);
		addbookframe.getContentPane().add(booknametextField);
		booknametextField.setColumns(10);
		
		bookeditiontextField = new JTextField();
		bookeditiontextField.setBounds(102, 159, 178, 20);
		addbookframe.getContentPane().add(bookeditiontextField);
		bookeditiontextField.setColumns(10);
		
		bookPublishertextField = new JTextField();
		bookPublishertextField.setBounds(102, 205, 177, 20);
		addbookframe.getContentPane().add(bookPublishertextField);
		bookPublishertextField.setColumns(10);
		
		
		addbookButton.setBounds(58, 365, 89, 23);
		addbookframe.getContentPane().add(addbookButton);
		
		JLabel lblNewLabel_4 = new JLabel("Category");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4.setBounds(30, 262, 62, 14);
		addbookframe.getContentPane().add(lblNewLabel_4);
		
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setBounds(172, 365, 89, 23);
		addbookframe.getContentPane().add(cancelButton);
		
		
		backButton.setBounds(285, 365, 89, 23);
		addbookframe.getContentPane().add(backButton);
		
		bookgenretextField = new JTextField();
		bookgenretextField.setBounds(102, 291, 178, 20);
		addbookframe.getContentPane().add(bookgenretextField);
		bookgenretextField.setColumns(10);
		
		JLabel bookgenreNewLabel = new JLabel("Book Genre");
		bookgenreNewLabel.setFont(new Font("Tahoma", Font.BOLD, 11));
		bookgenreNewLabel.setBounds(30, 294, 69, 14);
		addbookframe.getContentPane().add(bookgenreNewLabel);
		
		qtytextField = new JTextField();
		qtytextField.setBounds(102, 334, 178, 20);
		addbookframe.getContentPane().add(qtytextField);
		qtytextField.setColumns(10);
		
		JLabel lblNewLabel_5 = new JLabel("Quatity");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_5.setBounds(30, 337, 63, 14);
		addbookframe.getContentPane().add(lblNewLabel_5);
		
		bookListtextArea = new JTextArea();
		bookListtextArea.setEditable(false);
		bookListtextArea.setBounds(491, 41, 322, 372);
		addbookframe.getContentPane().add(bookListtextArea);
	}
}
