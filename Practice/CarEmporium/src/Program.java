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



		File file = new File("files\\cars.text");
		try {
			FileInputStream fis = new FileInputStream(file);
			ObjectInputStream ois = new ObjectInputStream(fis);
			cars = (List<Car>)ois.readObject();
			
			ois.close();
			fis.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			} catch (ClassNotFoundException classNotFoundException) {
				classNotFoundException.printStackTrace();
			}

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
						carsDisplayWindow.carsDisplaytextArea.setText(res);

						
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

						
						


						int year = 0;
						double weight = 0;
						double tanksise= 0;
						double batterysize= 0;
						
						if (!(carEntryWindow.yeartextField.getText().isEmpty() )|| !(carEntryWindow.yeartextField.getText().isBlank())){
						try {
						year = Integer.parseInt(carEntryWindow.yeartextField.getText());
						}catch (Exception y){
							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"year must be a numeric value");
							return;
						}
						}else {
							JOptionPane.showMessageDialog(null, "year cannot be empty");
							return;
						}

						if (!(carEntryWindow.weighttextField.getText().isEmpty() )|| !(carEntryWindow.weighttextField.getText().isBlank())) {
							try {
								weight = Integer.parseInt(carEntryWindow.weighttextField.getText());
							} catch (Exception w) {
								JOptionPane.showMessageDialog(carEntryWindow.submitButton, "weight must be a numeric value");
								return;
							}
						}else{
							JOptionPane.showMessageDialog(carEntryWindow.submitButton,"weight cannot be Empty");
							return;
						}
						
						

						if(carEntryWindow.ElectricRadioButton.isSelected()) {
							
							

							
							
							
							if (!(carEntryWindow.batterySizetextField.getText().isEmpty() || carEntryWindow.batterySizetextField.getText().isBlank())) {
							
							try {
							if (Integer.parseInt(carEntryWindow.batterySizetextField.getText()) > 0) {
							
							batterysize = Integer.parseInt(carEntryWindow.batterySizetextField.getText());
							}else {
			                    JOptionPane.showMessageDialog(null, "Battery size must be great than 0");
			                    return;
							}
							}catch (Exception i){
								JOptionPane.showMessageDialog(null, "Battery size must be a numeric value");
								return;
							}
							
							
							
							}else{
					            JOptionPane.showMessageDialog(null, "Battery size cannot be Empty");
					            return;
					        }
							
							
							
							
							
							if (carEntryWindow.batteryTypetextField.getText().isEmpty() || carEntryWindow.batteryTypetextField.getText().isBlank()){
								JOptionPane.showMessageDialog(carEntryWindow.submitButton, "battery Type cannot be empty");
								return;
							}
							
							
							
							


							
							Car car = new CarEletric(carEntryWindow.maketextField.getText(), carEntryWindow.modeltextField.getText(), year, weight, carEntryWindow.colorcomboBox.getSelectedItem().toString(), batterysize, carEntryWindow.batteryTypetextField.getText());
							cars.add(car);
							
							}else {
								


							if (!(carEntryWindow.tankSizetextField.getText().isEmpty() || carEntryWindow.tankSizetextField.getText().isBlank())) {
								try {
									if (Integer.parseInt(carEntryWindow.tankSizetextField.getText()) > 0) {
										tanksise = Integer.parseInt(carEntryWindow.tankSizetextField.getText());
									} else {
										JOptionPane.showMessageDialog(null, "Tank size must be great than 0");
										return;

									}
								} catch (Exception p) {
									JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Tank size must be a numeric value");
									return;
								}
							}else{
								JOptionPane.showMessageDialog(carEntryWindow.submitButton, "Tank size cannot be empty");
								return;
							}



							if (carEntryWindow.fuelTypetextField.getText().isEmpty() || carEntryWindow.fuelTypetextField.getText().isBlank()){
								JOptionPane.showMessageDialog(carEntryWindow.submitButton, "fuel Type cannot be empty");
								return;
							}






								
							
							Car car = new GasCar(carEntryWindow.maketextField.getText(), carEntryWindow.modeltextField.getText(), year, weight, carEntryWindow.colorcomboBox.getSelectedItem().toString(), tanksise, carEntryWindow.fuelTypetextField.getText());
							cars.add(car);
							
						}





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
						

					}
				});

			}
			public void closeApp(){
				try {
					FileOutputStream fos = new FileOutputStream(file);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(cars);
					
					oos.close();
					fos.close();
				}catch (Exception w){
					w.printStackTrace();
				}


				System.exit(0);
			}


		});
	}


}
