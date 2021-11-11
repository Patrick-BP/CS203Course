package Question3;


import javax.sound.midi.Soundbank;
import java.io.File;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        String filePath = "D:\\MIU\\CS203\\CS203Course\\Assignments\\Lab6\\Files\\Q3File.text";
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
            File readfile = new File(filePath);
            Scanner sc = new Scanner(readfile);
            while (sc.hasNextLine()){
                data = sc.nextLine();
            }
        }catch (IOException e){
            e.printStackTrace();
        }

        String[] arr = data.split(" ");
        for (int i=0; i<arr.length; i++) num += Double.parseDouble(arr[i]);
        double avg = num/arr.length;
        System.out.println(avg);
    }
}
