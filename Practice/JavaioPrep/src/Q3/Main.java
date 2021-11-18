package Q3;

import java.io.*;

public class Main {
    public static void main(String[] args) {


    File file = new File("Files\\question3.txt");
    FileReader freader = null;
        try

    {
        freader = new FileReader(file);
        BufferedReader breader = new BufferedReader(freader);
        String data = "";
        double arr = 0;
        int counter=0;
        while ((data = breader.readLine()) != null) {

            arr += Double.parseDouble(data);
counter++;

        }

        System.out.println(arr/counter);
    } catch(
    FileNotFoundException e)

    {
        e.printStackTrace();
    } catch(
    IOException e)

    {
        e.printStackTrace();
    }

}
}
