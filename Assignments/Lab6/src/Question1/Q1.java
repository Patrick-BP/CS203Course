package Question1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String girlNamesFilePath = "D:\\MIU\\CS203\\CS203Course\\Assignments\\Lab6\\Files\\girlnames.text";
        String boyNamesFilePath = "D:\\MIU\\CS203\\CS203Course\\Assignments\\Lab6\\Files\\boynames";
        String girldata="";
        String boydata="";
        int counter =0;
        String x="10";


        try {
            File readfilegirl = new File(girlNamesFilePath);
            Scanner girlreader = new Scanner(readfilegirl);
            while(girlreader.hasNextLine()){
                girldata  = girlreader.nextLine();
                System.out.println(girldata);
            }
        }catch (IOException e){
            e.printStackTrace();
        }
        try {
            File readfileboy = new File(girlNamesFilePath);
            Scanner boyreader = new Scanner(readfileboy);
            while(boyreader.hasNextLine()){
                boydata  = boyreader.nextLine();
                System.out.println(boydata);
            }
        }catch (IOException e){
            e.printStackTrace();
        }




        //String[] str = data.split(" ");
//        for (int i=0; i < str.length; i++) {
//            if(str[i].equals(x)) counter++;
//        }
//        System.out.println(counter);
   // }

    }
}
