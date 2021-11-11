package Question2;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String filePath = "D:\\MIU\\CS203\\CS203Course\\Assignments\\Lab6\\Files\\Q2File.text";
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
            writeFile.write("10 4 7 8 10 34 11 10 15 6 10 45");
            writeFile.close();
        }catch(IOException e){
            System.out.println("there was an error");
            e.printStackTrace();

        }
        try {
            File readfile = new File(filePath);
            Scanner myreader = new Scanner(readfile);
            while(myreader.hasNextLine()){
               data  = myreader.nextLine();
                System.out.println(data);
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
