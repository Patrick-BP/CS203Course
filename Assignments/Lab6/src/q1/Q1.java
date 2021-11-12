package q1;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;
public class Q1 {
    String girlNamesFilePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/girlnames.txt";
    String boyNamesFilePath = "/Users/bp/Desktop/MIU/CS203Course/Assignments/Lab6/Files/boynames.txt";
        private String[] nameBoys = new String[1000], nameGirls = new String[1000];
        private int[] numBoys = new int[1000], numGirls = new int[1000];

        public void readData(String fName)
        {

            String[] names = new String[1000];
            int[] total = new int[1000];
            try {
                String line = null;
                int countNum = 0;
                BufferedReader br = new BufferedReader(new FileReader(fName));
                while ((line = br.readLine()) != null) {
                    String[] data = line.split(" ");
                    names[countNum] = data[0];
                    total[countNum] = Integer.parseInt(data[1]);
                    countNum++;
                }

                if (fName == "boynames.txt")
                {
                    this.nameBoys = names;
                    this.numBoys = total;
                } else
                {
                    this.nameGirls = names;
                    this.numGirls = total;
                }
                br.close();

            } catch (FileNotFoundException e)
            {
                System.out.println("File not found.");
                e.printStackTrace();
            } catch (IOException e)
            {
                System.out.println("An error contains in input file");
                e.printStackTrace();
            }
        }
        public void getNameData()
        {
            Scanner scn = new Scanner(System.in);
            System.out.print("Enter a boy or girl name:");
            String name = scn.next();
            if (Arrays.asList(this.nameBoys).contains(name))
            {
                int index = Arrays.asList(this.nameBoys).indexOf(name);
                int occurences = numBoys[index];
                System.out.println(name + " is ranked " + (index + 1) + " in popularity " + "among boys with " + occurences
                        + " namings.");
            } else
                System.out.println(name + " is not ranked among the top 1000 girl names.");

            if (Arrays.asList(this.nameGirls).contains(name)) {
                int index = Arrays.asList(this.nameGirls).indexOf(name);
                int occurences = numGirls[index];
                System.out.println(name + " is ranked " + (index + 1) + " in popularity " + "among girls with " + occurences
                        + " namings.");
            } else
                System.out.println(name + " is not ranked among the top 1000 girl names.");

        }

        public static void main(String[] args)
        {

            Q1  nd= new Q1();
            nd.readData("boynames.txt");
            nd.readData("girlnames.txt");
            nd.getNameData();

        }

    }

