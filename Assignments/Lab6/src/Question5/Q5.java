package Question5;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class Q5 {
    public static void main(String[] args) {
        String filePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/WordBuff.txt";
        String data="";

        try {
            File myfile = new File(filePath);
            if(myfile.exists() && myfile.canRead()) {
                FileReader readfile = new FileReader(myfile);
                BufferedReader bReader = new BufferedReader(readfile);
                data = bReader.readLine();

                readfile.close();
                bReader.close();
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        String[] str = data.split(",");
        System.out.println(Arrays.toString(str));
        String str4 = "";
        int counter=0;
        for (String e: str) {
            for(int i=e.length()-1; i>=0; i--){
                str4 += e.charAt(i);
            }
            if (str4.equals(e))counter++;
            str4="";
        }
        System.out.println(counter);
    }



}
