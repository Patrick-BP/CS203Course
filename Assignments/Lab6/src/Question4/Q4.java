package Question4;

import java.io.*;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        String filePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/Q4File.txt";
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("your file has been created");
            }
        }catch (IOException e){
            System.out.println("there was an error");
        }

        try{
            File file = new File(filePath);
            FileReader fready = new FileReader(file);
            BufferedReader bready = new BufferedReader(fready);
            String data = bready.readLine();
            System.out.println(data);

        }catch (IOException e){
            System.out.println("there was an error");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your advice");
        String input = sc.nextLine();


        try {
            FileWriter writeFile = new FileWriter(filePath);
            BufferedWriter bWriter = new BufferedWriter(writeFile);
            bWriter.write(input);
            bWriter.close();
            writeFile.close();
        }catch(IOException e){
            System.out.println("there was an error");
            e.printStackTrace();

        }

    }
}
