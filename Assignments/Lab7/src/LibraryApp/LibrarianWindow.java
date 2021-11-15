package LibraryApp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class LibrarianWindow {

	public JFrame librarianWindowframe;
	public JButton exitButton = new JButton("Exit");
	public JButton addPublicationsButton = new JButton("Add publications");
	public JButton addUserButton = new JButton("Add new Member");
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public LibrarianWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		librarianWindowframe = new JFrame();
		librarianWindowframe.setTitle("Librarian Window");
		librarianWindowframe.setResizable(false);
		librarianWindowframe.setBounds(100, 100, 768, 222);
		librarianWindowframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		librarianWindowframe.getContentPane().setLayout(null);
		
		
		addPublicationsButton.setBounds(32, 48, 133, 23);
		librarianWindowframe.getContentPane().add(addPublicationsButton);
		
		
		addUserButton.setBounds(192, 48, 133, 23);
		librarianWindowframe.getContentPane().add(addUserButton);
		
		JButton bookIssueButton = new JButton("Book issue");
		bookIssueButton.setBounds(344, 48, 133, 23);
		librarianWindowframe.getContentPane().add(bookIssueButton);
		
		JButton loanhistoryButton = new JButton("Loan History");
		loanhistoryButton.setBounds(500, 48, 133, 23);
		librarianWindowframe.getContentPane().add(loanhistoryButton);
		
		
		exitButton.setBounds(544, 141, 89, 23);
		librarianWindowframe.getContentPane().add(exitButton);
	}

}
