package Question1;

import java.io.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String girlNamesFilePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/girlnames.text";
        String boyNamesFilePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/boynames.text";
        String girldata="";
        String boydata="";
        int index =0;
        Scanner sc =new Scanner(System.in);
        System.out.println("enter a mame ");
        String name = sc.nextLine();



        try {
            File readfileboy = new File(girlNamesFilePath);
            if(readfileboy.exists()&&readfileboy.canRead()) {
                FileReader fReader = new FileReader(readfileboy);
                BufferedReader bReader = new BufferedReader(fReader);
                String boynames = bReader.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
        //loop through girl names
        System.out.println();
        //loop through boy names
        System.out.println();
    }

    public static String readFile(String ){
        try {
            File readfilegirl = new File(girlNamesFilePath);
            if(readfilegirl.exists()&&readfilegirl.canRead()) {
                FileReader fReader = new FileReader(readfilegirl);
                BufferedReader bReader = new BufferedReader(fReader);
                String girlnames = bReader.readLine();
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
