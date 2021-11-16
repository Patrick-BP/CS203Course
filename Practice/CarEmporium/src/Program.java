import javax.swing.*;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Program {

	private static CarEmporiumWindow carEmporiumWindow;
	private static CarEntryWindow carEntryWindow;
	private static CarsDisplayWindow carsDisplayWindow;
	public static List<Car> cars = new ArrayList<>();


	public static void main(String[] args) {

		File file = new File("/Users/bp/Desktop/MIU/CS203Course/Practice/CarEmporium/files/cars.text");


		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					carEmporiumWindow = new CarEmporiumWindow();
					carEntryWindow = new CarEntryWindow();
					carsDisplayWindow = new CarsDisplayWindow();
					carEmporiumWindow.carEmporiumframe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}


				//car entry button (carEmporiumWindow)
				carEmporiumWindow.carEntryButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						carEmporiumWindow.carEmporiumframe.setVisible(false);
						carEntryWindow.carEntryFrame.setVisible(true);
					}
				});

				//car Display button (carEmporiumWindow)
				carEmporiumWindow.carDisplayButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {

						carEmporiumWindow.carEmporiumframe.setVisible(false);
						carsDisplayWindow.CarDisplayframe.setVisible(true);


						String res= "";
						for (Car c: cars) {
							res +=c+"\n";
						}
						carsDisplayWindow.carsDisplytextArea.setText(res);


					}
				});

				// submit button (car entry window)
				carEntryWindow.submitButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if (carEntryWindow.maketextField.getText().isEmpty() || carEntryWindow.maketextField.getText().isBlank()){
							JOptionPane.showMessageDialog(carEntryWindow.submitButton, "make cannot be empty");
							return;
						}
						if (carEntryWindow.modeltextField.getText().isEmpty() || carEntryWindow.modeltextField.getText().isBlank()){
							JOptionPane.showMessageDialog(carEntryWindow.submitButton, "model cannot be empty");
							return;
						}

//						if (carEntryWindow.fuelTypetextField.getText().isEmpty() || carEntryWindow.fuelTypetextField.getText().isBlank()){
//							JOptionPane.showMessageDialog(carEntryWindow.submitButton, "fuel Type cannot be empty");
//							return;
//						}
//						if (carEntryWindow.batteryTypetextField.getText().isEmpty() || carEntryWindow.batteryTypetextField.getText().isBlank()){
//							JOptionPane.showMessageDialog(carEntryWindow.submitButton, "battery Type cannot be empty");
//							return;
//						}
						if((carEntryWindow.gasRadioButton.isSelected()==false)&&(carEntryWindow.ElectricRadioButton.isSelected()==false)){
							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"Please select radio button");
						}

						int year = 0;
						double weight = 0;
						double tanksise= 0;
						double batterysize= 0;
						try {
						year = Integer.parseInt(carEntryWindow.yeartextField.getText());
						}catch (Exception y){
							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"year must be a numeric value");
						}
						try {
						weight = Integer.parseInt(carEntryWindow.weighttextField.getText());
						}catch (Exception w){
							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"year must be a numeric value");
						}
						
//						try {
//							tanksise = Integer.parseInt(carEntryWindow.tankSizetextField.getText());
//						}catch (Exception w){
//							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"year must be a numeric value");
//						}
//						try {
//							batterysize = Integer.parseInt(carEntryWindow.batterySizetextField.getText());
//						}catch (Exception w){
//							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"year must be a numeric value");
//						}

						Car gascar = new GasCar(carEntryWindow.maketextField.getText(),carEntryWindow.modeltextField.getText(),year,weight,carEntryWindow.colorcomboBox.getSelectedItem().toString(),tanksise,carEntryWindow.fuelTypetextField.getText());
						Car elecCar = new CarEletric(carEntryWindow.maketextField.getText(),carEntryWindow.modeltextField.getText(),year,weight,carEntryWindow.colorcomboBox.getSelectedItem().toString(),batterysize,carEntryWindow.batteryTypetextField.getText());
						cars.add(gascar);
						cars.add(elecCar);


						JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Added successfully");

						carEntryWindow.batteryTypetextField.setText("");
						carEntryWindow.fuelTypetextField.setText("");
						carEntryWindow.tankSizetextField.setText("");
						carEntryWindow.maketextField.setText("");
						carEntryWindow.batterySizetextField.setText("");
						carEntryWindow.modeltextField.setText("");
						carEntryWindow.yeartextField.setText("");
						carEntryWindow.weighttextField.setText("");
						
						

					}
				});
				
				//return button (car entry window)
				carEntryWindow.returnButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						carEntryWindow.carEntryFrame.setVisible(false);
						carEmporiumWindow.carEmporiumframe.setVisible(true);
					}
				});
				
				//return button (car Display)
				carsDisplayWindow.returnButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						carsDisplayWindow.CarDisplayframe.setVisible(false);
						carEmporiumWindow.carEmporiumframe.setVisible(true);
					}
				});
			
				//gas radio button (Entry car window)
				carEntryWindow.gasRadioButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						carEntryWindow.ElectricRadioButton.setSelected(false);
						carEntryWindow.batterySizetextField.setEnabled(false);
						carEntryWindow.batteryTypetextField.setEnabled(false);
						carEntryWindow.fuelTypetextField.setEnabled(true);
						carEntryWindow.tankSizetextField.setEnabled(true);

					}
				});
				// electric radio button (Entry car window)
				carEntryWindow.ElectricRadioButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						carEntryWindow.gasRadioButton.setSelected(false);
						carEntryWindow.fuelTypetextField.setEnabled(false);
						carEntryWindow.tankSizetextField.setEnabled(false);
						carEntryWindow.batterySizetextField.setEnabled(true);
						carEntryWindow.batteryTypetextField.setEnabled(true);
					}
				});

				//exit button (car Emporium)
				carEmporiumWindow.exitButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						closeApp();
					}
				});
				//exit button (car Entry)
				carEntryWindow.exitButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						closeApp();
					}
				});
				//exit button (car display)
				carsDisplayWindow.exitButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						closeApp();
					}
				});
				//car Display (car Emporium)
				carEmporiumWindow.carDisplayButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						try {
						FileInputStream fis = new FileInputStream(file);
						ObjectInputStream ois = new ObjectInputStream(fis);
						cars = (List<Car>)ois.readObject();
						} catch (IOException ex) {
							ex.printStackTrace();
						} catch (ClassNotFoundException classNotFoundException) {
							classNotFoundException.printStackTrace();
						}

					}
				});




			}
			public void closeApp(){
				try {
					FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(cars);
				}catch (Exception w){
					w.printStackTrace();
				}


				System.exit(0);
			}


		});
	}


}
