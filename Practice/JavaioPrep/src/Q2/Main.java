package Q2;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("Files\\question2.txt");
        FileReader freader = null;
        try {
            freader = new FileReader(file);
            BufferedReader breader = new BufferedReader(freader);
            String data="";
            String [] arr =null;
            while((data = breader.readLine()) !=null){

            arr =data.split(" ");


            }
            int counter=0;
            for (String e: arr) {
                if(e.equals("10")) counter++;
            }
            System.out.println(counter);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
