package Question3;


import javax.sound.midi.Soundbank;
import javax.xml.transform.Source;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String filePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/Q3File.txt";
        double num = 0;
        String data="";
        try {
            File file = new File(filePath);
            if (file.createNewFile()) {
                System.out.println("your file has being created");
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try {

            File file = new File(filePath);
           if (file.exists() && file.canRead()){
               FileReader fReader = new FileReader(file);
               BufferedReader bReader = new BufferedReader(fReader);
                data = bReader.readLine();
               System.out.println(data);
                bReader.close();
                fReader.close();
           }
        }catch (IOException e){
            e.printStackTrace();
        }

        String[] arr = data.split(" ");
        for (int i=0; i<arr.length; i++) num += Double.parseDouble(arr[i]);
        double avg = num/arr.length;
        System.out.println("the average is: " + avg);
    }
}
