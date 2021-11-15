package LibraryApp;

import java.awt.EventQueue;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;


import javax.swing.JOptionPane;

import org.w3c.dom.ls.LSOutput;



public class Main {
	
	private static LoginWindow loginwindow ;
	private static LibrarianWindow librarianWindow;
	private static AddBook addBook;
	private static AddMemberWindow addMemberWindow;
	private static List<Book> booklist = new ArrayList<>();
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

			File bookfile =new File("D:\\MIU\\CS203Course\\Assignments\\Lab7\\files\\books.txt");

				try {
					FileOutputStream fos =new FileOutputStream(bookfile);
					ObjectOutputStream oos = new ObjectOutputStream(fos);
					oos.writeObject(booklist);
					oos.close();
					fos.close();


				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			


			
			EventQueue.invokeLater(new Runnable() {
				public void run() {
					try {
						 loginwindow = new LoginWindow();
						 librarianWindow = new LibrarianWindow ();
						 addBook = new AddBook() ;
						 addMemberWindow = new AddMemberWindow();
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


					//add book button (addbookwindow)
					addBook.addbookButton.addActionListener(new ActionListener() {
						@Override
						public void actionPerformed(ActionEvent e) {

							int id= 0;
							int qty = 0;
							try {
								id = Integer.parseInt(addBook.bookidtextField.getText());
								qty = Integer.parseInt(addBook.qtytextField.getText());
							}catch (Exception i){
								JOptionPane.showMessageDialog(addBook.addbookButton, "book ID cannot be empty");
							}
							if (addBook.booknametextField.getText().isEmpty() || addBook.booknametextField.getText().isBlank()){
								JOptionPane.showMessageDialog(addBook.addbookButton, "book cannot be empty");
								return;
							}
							if (addBook.bookeditiontextField.getText().isEmpty() || addBook.bookeditiontextField.getText().isBlank()){
								JOptionPane.showMessageDialog(addBook.addbookButton, "book cannot be empty");
								return;
							}
							if (addBook.bookPublishertextField.getText().isEmpty() || addBook.bookPublishertextField.getText().isBlank()){
								JOptionPane.showMessageDialog(addBook.addbookButton, "book cannot be empty");
								return;
							}
							if (addBook.bookgenretextField.getText().isEmpty() || addBook.bookgenretextField.getText().isBlank()){
								JOptionPane.showMessageDialog(addBook.addbookButton, "book cannot be empty");
								return;
							}

							Book newBook = new Book(addBook.booknametextField.getText(), addBook.bookPublishertextField.getText(), id,qty,addBook.bookCategorycomboBox.getToolTipText(),addBook.bookgenretextField.getText());
							booklist.add(newBook);

							addBook.bookeditiontextField.setText("");
							addBook.bookPublishertextField.setText("");
							addBook.bookidtextField.setText("");
							addBook.bookgenretextField.setText("");
							addBook.booknametextField.setText("");
							addBook.qtytextField.setText("");

							String res = "";
							for(Book c : booklist) {
								res += c + "\n";
							}

							addBook.bookListtextArea.setText(res);

							JOptionPane.showMessageDialog(addBook.addbookButton, "Added!");


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
					
					//add new publication button (Librarian window)
					librarianWindow.addPublicationsButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							librarianWindow.librarianWindowframe.setVisible(false);
							addBook.addbookframe.setVisible(true);
							
						}
					});
					
					//back button (addbook window)
					addBook.backButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addBook.addbookframe.setVisible(false);
							librarianWindow.librarianWindowframe.setVisible(true);
							
						}
				
					});
					
					// back button addmember window
					addMemberWindow.backNewButton.addActionListener(new ActionListener() {
						
						@Override
						public void actionPerformed(ActionEvent e) {
							addMemberWindow.addMemberframe.setVisible(false);
							librarianWindow.librarianWindowframe.setVisible(true);
							
						}
					});
					
					try {
						FileInputStream fis =new FileInputStream(bookfile);
						ObjectInputStream oos = new ObjectInputStream(fis);
						booklist = (List<Book>) oos.readObject();




					} catch (IOException | ClassNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					
				}
			});
		}

	public static void closeApp() {
		System.exit(0);
	
	}

}
