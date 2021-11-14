import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SuperApp {

	private JFrame frank;
	private JTextField numberText;
	private JTextField Number2Text;
	private JTextField resultText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuperApp window = new SuperApp();
					window.frank.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SuperApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frank = new JFrame();
		frank.setResizable(false);
		frank.setTitle("Frank Main Window");
		frank.setBounds(100, 100, 450, 300);
		frank.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frank.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		numberText = new JTextField();
		frank.getContentPane().add(numberText);
		numberText.setColumns(10);
		
		Number2Text = new JTextField();
		frank.getContentPane().add(Number2Text);
		Number2Text.setColumns(10);
		
		JButton addButton = new JButton("+");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n1 = numberText.getText();
				String n2 = Number2Text.getText();
				int x = 0;
				int y = 0;
				try {
					x = Integer.parseInt(n1);
					y = Integer.parseInt(n2);
				}catch(Exception e1) {
					JOptionPane.showMessageDialog(addButton, "Inputs must be numeric");
					numberText.setText("");
					Number2Text.setText("");
					return;
				}
				
				resultText.setText("" + (x + y));
			}
		});
		frank.getContentPane().add(addButton);
		
		resultText = new JTextField();
		frank.getContentPane().add(resultText);
		resultText.setColumns(10);
	}

}
