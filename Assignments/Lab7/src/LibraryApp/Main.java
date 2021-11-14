package LibraryApp;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;



public class Main {
	
	private static LoginWindow loginwindow ;
	private static LibrarianWindow librarianWindow;
	private static List<Librarianlogin> librarianlist = new ArrayList<>(); 
		
		public static void main(String[] args) {
		
			File file =new File("D:\\MIU\\CS203Course\\Assignments\\Lab7\\files\\librarian.txt");
			if(file.isFile() && file.canRead()) {
			try {
				FileReader fReader = new FileReader(file);
				BufferedReader br = new BufferedReader(fReader);
				String data="";
				while((data = br.readLine()) !=null) {
					String[] datalist = data.split(" ");
					Librarianlogin librarianlogin = new Librarianlogin(datalist[0], datalist[1]);
					librarianlist.add(librarianlogin);
				}
				
				
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			}
			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						 loginwindow = new LoginWindow();
						 librarianWindow = new LibrarianWindow ();
						loginwindow.loginWindowframe.setVisible(true);
					} catch (Exception e) {
						e.printStackTrace();
					}
					//librarian window exit button
					librarianWindow.exitButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							closeApp();
							
							
						}
					});
				
					//login button
					loginwindow.loginButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							if(loginwindow.usernametextField.getText().isEmpty() || loginwindow.usernametextField.getText().isBlank()) {
								JOptionPane.showMessageDialog(loginwindow.loginButton, "username cannot be empty");
								return;
							}
							if(loginwindow.passwordtextField.getText().isEmpty() || loginwindow.passwordtextField.getText().isBlank()) {
								JOptionPane.showMessageDialog(loginwindow.loginButton, "password cannot be empty");
								return;
							}
							
							for(Librarianlogin l: librarianlist) {
								if(l.getUsername().equals(loginwindow.usernametextField.getText()) && l.getPassword().equals(loginwindow.passwordtextField.getText())) {
									loginwindow.loginWindowframe.setVisible(false);
									librarianWindow.librarianWindowframe.setVisible(true);
								}else {
									JOptionPane.showMessageDialog(loginwindow.loginButton, "Incorrect username/password");
									loginwindow.usernametextField.setText("");
									loginwindow.passwordtextField.setText("");
									
								}
							}
							
							
							
						}
					});
					
					
					
					
				}
			});
		}

	public static void closeApp() {
		System.exit(0);
	
	}

}
