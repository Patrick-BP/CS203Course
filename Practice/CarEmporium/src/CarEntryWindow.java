import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class CarEntryWindow {

	public JFrame carEntryFrame;
	public JTextField maketextField;
	public JTextField modeltextField;
	public JTextField yeartextField;
	public JTextField weighttextField;
	public JTextField tankSizetextField;
	public JTextField fuelTypetextField;
	public JTextField batterySizetextField;
	public JTextField batteryTypetextField;
	public JComboBox colorcomboBox = new JComboBox();
	public JRadioButton gasRadioButton = new JRadioButton("Gas");
	public JRadioButton ElectricRadioButton = new JRadioButton("Electric?");
	public JLabel lblNewLabel_3 = new JLabel("Weight:");
	public JButton submitButton = new JButton("Submit");
	public JButton returnButton = new JButton("Return");
	public JButton exitButton;

	/**
	 * Launch the application.
	 */


	/**
	 * Create the application.
	 */
	public CarEntryWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		carEntryFrame = new JFrame();
		carEntryFrame.setResizable(false);
		carEntryFrame.setTitle("Car Emporium -Car Entry");
		carEntryFrame.setBounds(100, 100, 500, 300);
		carEntryFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		carEntryFrame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Make:");
		lblNewLabel.setBounds(6, 16, 49, 16);
		carEntryFrame.getContentPane().add(lblNewLabel);
		
		maketextField = new JTextField();
		maketextField.setBounds(67, 11, 276, 26);
		carEntryFrame.getContentPane().add(maketextField);
		maketextField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Model:");
		lblNewLabel_1.setBounds(363, 16, 61, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_1);
		
		modeltextField = new JTextField();
		modeltextField.setBounds(16, 49, 263, 26);
		carEntryFrame.getContentPane().add(modeltextField);
		modeltextField.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Year:");
		lblNewLabel_2.setBounds(314, 54, 61, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_2);
		
		yeartextField = new JTextField();
		yeartextField.setBounds(354, 49, 90, 26);
		carEntryFrame.getContentPane().add(yeartextField);
		yeartextField.setColumns(10);
		

		lblNewLabel_3.setBounds(6, 89, 61, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_3);
		
		weighttextField = new JTextField();
		weighttextField.setBounds(73, 84, 78, 26);
		carEntryFrame.getContentPane().add(weighttextField);
		weighttextField.setColumns(10);
		

		colorcomboBox.setModel(new DefaultComboBoxModel(new String[] {"Red", "Bleu", "Gray", "White", "Yellow", "Black"}));
		colorcomboBox.setBounds(163, 85, 105, 27);
		carEntryFrame.getContentPane().add(colorcomboBox);
		

		gasRadioButton.setBounds(268, 87, 61, 23);
		carEntryFrame.getContentPane().add(gasRadioButton);
		

		ElectricRadioButton.setBounds(342, 87, 141, 23);
		carEntryFrame.getContentPane().add(ElectricRadioButton);
		
		tankSizetextField = new JTextField();
		tankSizetextField.setBounds(83, 121, 105, 26);
		carEntryFrame.getContentPane().add(tankSizetextField);
		tankSizetextField.setColumns(10);
		
		fuelTypetextField = new JTextField();
		fuelTypetextField.setBounds(285, 121, 90, 26);
		carEntryFrame.getContentPane().add(fuelTypetextField);
		fuelTypetextField.setColumns(10);
		
		JLabel lblNewLabel_4 = new JLabel("Tank Size:");
		lblNewLabel_4.setBounds(6, 126, 80, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Fuel Type:");
		lblNewLabel_5.setBounds(214, 126, 78, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_7 = new JLabel("Battery size:");
		lblNewLabel_7.setBounds(6, 176, 80, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_7);
		
		batterySizetextField = new JTextField();
		batterySizetextField.setBounds(96, 171, 130, 26);
		carEntryFrame.getContentPane().add(batterySizetextField);
		batterySizetextField.setColumns(10);
		
		JLabel lblNewLabel_8 = new JLabel("Battery Type:");
		lblNewLabel_8.setBounds(229, 176, 89, 16);
		carEntryFrame.getContentPane().add(lblNewLabel_8);
		
		batteryTypetextField = new JTextField();
		batteryTypetextField.setBounds(314, 171, 130, 26);
		carEntryFrame.getContentPane().add(batteryTypetextField);
		batteryTypetextField.setColumns(10);
		

		submitButton.setBounds(34, 220, 117, 29);
		carEntryFrame.getContentPane().add(submitButton);
		

		returnButton.setBounds(175, 220, 117, 29);
		carEntryFrame.getContentPane().add(returnButton);
		
		exitButton = new JButton("Exit");
		exitButton.setBounds(307, 220, 117, 29);
		carEntryFrame.getContentPane().add(exitButton);
	}
}
