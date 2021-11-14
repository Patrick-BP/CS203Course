package CarGUI;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.*;

import javax.swing.JOptionPane;

public class Program {
	
	private static addCarWindow addWindow;
	private static ShowCarsWindow showCars;
	private static List<Car> cars = new ArrayList<Car>();
	
	public static void main(String[] args) {
		
		File f = new File("C:\\Users\\611041\\Desktop\\cars.txt");
		if(f.isFile() && f.canRead()) {
			try {
			FileInputStream s = new FileInputStream(f);
			ObjectInputStream o = new ObjectInputStream(s);
			cars = (List<Car>)o.readObject();
			o.close();
			s.close();
			}catch(Exception ooo) {
				
			}	
		}
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					addWindow = new addCarWindow();
					showCars = new ShowCarsWindow();
					addWindow.addCarWindowFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				//Show cars button
				addWindow.showCarsButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						addCarWindow.addCarWindowFrame.setVisible(false);
						showCars.ShowCarsFrame.setVisible(true);
						
						String res = "";
						for(Car c : cars) {
							res += c + "\n";
						}
						
						showCars.carDisplayTextArea.setText(res);
					}	
				});
				//Back button
				showCars.backButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						showCars.ShowCarsFrame.setVisible(false);
						addCarWindow.addCarWindowFrame.setVisible(true);
					}
				});
				//Exit buttons
				addWindow.exitButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						closeApp();
					}
				});
				showCars.exitButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						closeApp();
					}
				});
				
				
				addWindow.addButton.addActionListener(new ActionListener() {
					@Override
					public void actionPerformed(ActionEvent e) {
						if(addWindow.makeText.getText().isEmpty() || addWindow.makeText.getText().isBlank()) {
							JOptionPane.showMessageDialog(addWindow.addButton, "Make cannot be blank");
							return;
						}
						
						if(addWindow.modelText.getText().isEmpty() || addWindow.modelText.getText().isBlank()) {
							JOptionPane.showMessageDialog(addWindow.addButton, "Model cannot be blank");
							return;
						}
						
						if(addWindow.yearText.getText().isEmpty() || addWindow.yearText.getText().isBlank()) {
							JOptionPane.showMessageDialog(addWindow.addButton, "Year cannot be blank");
							return;
						}
						
						int year = 0;
						
						try {
							year = Integer.parseInt(addWindow.yearText.getText());
						}catch(Exception e2) {
							JOptionPane.showMessageDialog(addWindow.addButton, "Year needs to be a numeric value");
							return;
						}
						
						
						Car c = new Car(addWindow.makeText.getText(), addWindow.modelText.getText(), year);
						cars.add(c);
						
						addWindow.makeText.setText("");
						addWindow.modelText.setText("");
						addWindow.yearText.setText("");
						
						JOptionPane.showMessageDialog(addWindow.addButton, "Added!");
						
					}
				});
				
				
			}
			
			void closeApp() {
				try {
					FileOutputStream fo = new FileOutputStream("C:\\Users\\611041\\Desktop\\cars.txt");
					ObjectOutputStream oos = new ObjectOutputStream(fo);
					oos.writeObject(cars);
					oos.close();
					fo.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
				System.exit(0);
			}
		});
	}
}
