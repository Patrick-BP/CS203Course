package Question1;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        String girlNamesFilePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/girlnames.txt";
        String boyNamesFilePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/boynames.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a mame ");
        String name = sc.nextLine();
        //loop through girl names
        int girlNameRank = findRank(girlNamesFilePath, name);
        if(girlNameRank>0)System.out.println(name + " is ranked " + girlNameRank + " in popularity amoung girls with "+fileSize(girlNamesFilePath)+" namings");
        else System.out.println(name + " is ranked not ranked amoung girls with "+fileSize(boyNamesFilePath)+" namings");
        //loop through boy names
        int boyNameRank = findRank(boyNamesFilePath, name);
        if (boyNameRank>0) System.out.println(name + " is ranked " + boyNameRank + " in popularity amoung boys with "+fileSize(boyNamesFilePath)+" namings");
        else System.out.println(name + " is ranked not ranked amoung boys with "+fileSize(boyNamesFilePath)+" namings");
    }
    public static int findRank(String path, String name) {
        String names = "";
        int index = 0;
        try {
            File readfile = new File(path);
            if (readfile.exists() && readfile.canRead()) {
                FileReader fReader = new FileReader(readfile);
                BufferedReader bReader = new BufferedReader(fReader);
                names = bReader.readLine();
                String[] namesList = names.split(" ");
                bReader.close();
                fReader.close();
                for (int i = 0; i < namesList.length; i++) {
                    if (namesList[i].equalsIgnoreCase(name)) {
                        index = i + 1;
                    }
                }
            } else System.out.println("cant read the file");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return index;
    }
    public static int fileSize(String path) {
        String names = "";
        int size=0;
        try {
            File readfile = new File(path);
            if (readfile.exists() && readfile.canRead()) {
                FileReader fReader = new FileReader(readfile);
                BufferedReader bReader = new BufferedReader(fReader);
                names = bReader.readLine();
                String[] namesList = names.split(" ");
                size = namesList.length;
                bReader.close();
                fReader.close();
            }
            }catch(IOException e){
                e.printStackTrace();
            }
            return size;

    }
}