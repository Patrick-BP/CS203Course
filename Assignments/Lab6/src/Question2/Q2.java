package Question2;

import java.io.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String filePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/Q2File.txt";
        String data="";
        int counter =0;
        String x="10";
        try {
            File file = new File(filePath);
            if (file.createNewFile()) System.out.println("your file has been created ");
        }catch (IOException e){

            e.printStackTrace();
        }
        try {
            FileWriter writeFile = new FileWriter(filePath);
            BufferedWriter bWriter = new BufferedWriter(writeFile);
            bWriter.write("10 4 7 8 10 34 11 10 15 6 10 45");
            bWriter.close();
            writeFile.close();
        }catch(IOException e){
            System.out.println("there was an error");
            e.printStackTrace();

        }
        try {
            File myfile = new File(filePath);
            if(myfile.exists() && myfile.canRead()) {
                FileReader readfile = new FileReader(myfile);
                BufferedReader bReader = new BufferedReader(readfile);
                data = bReader.readLine();
                System.out.println(data);
                readfile.close();
                bReader.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        String[] str = data.split(" ");
        for (int i=0; i < str.length; i++) {
            if(str[i].equals(x)) counter++;
        }
        System.out.println(counter);
    }
}
