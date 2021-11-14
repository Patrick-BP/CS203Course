package BufferedWriter;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedRead_Write {
	public static void main(String[] args) {
		try {
			FileWriter writer = new FileWriter("C:\\Users\\611041\\Desktop\\Jason.txt", true);
			BufferedWriter bWriter = new BufferedWriter(writer);
			bWriter.write("Excuse me sir, you say if the file exists.. you can't read it? confused emoji !!!");
			bWriter.close();
			writer.close();	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		try {
			
			File f = new File("C:\\Users\\611041\\Desktop\\Jason.txt");
			if(f.exists() && f.canRead()) {
				FileReader reader = new FileReader(f);
				BufferedReader bReader = new BufferedReader(reader);
				String result = bReader.readLine();
				bReader.close();
				reader.close();
				System.out.println("Reading file: "+ result);
			}
			
		}catch(Exception e) {
			
		}
	}
}
