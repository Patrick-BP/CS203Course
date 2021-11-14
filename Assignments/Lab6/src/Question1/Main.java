package Question1;


import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        String girlspath = "D:\\MIU\\CS203Course\\Assignments\\Lab6\\Files\\girlnames.txt";
        String boyspath = "D:\\MIU\\CS203Course\\Assignments\\Lab6\\Files\\boynames.txt";

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a name");
        String name = sc.nextLine();
        String girls = "girls";
        String boys="boys";

        findRank(listOfNames(girlspath),name,girls);
        findRank(listOfNames(boyspath),name,boys);

    }

        public static List<BoyAndGirlNames> listOfNames(String path){
            File file = new File(path);
            List<BoyAndGirlNames> list = new ArrayList<>();
            String[] arr =null ;
            String data;
            try {
                FileReader fileReader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(fileReader);
                while( (data = bReader.readLine()) != null){
                        arr = data.split(" ");
                        BoyAndGirlNames g = new BoyAndGirlNames(arr[0], Integer.parseInt(arr[1]));
                        list.add(g);

                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            Collections.sort(list);
            return list;
        }

        public static void findRank(List<BoyAndGirlNames> list, String name, String gender) {
        int rank=0;
        int size=0;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getName().equalsIgnoreCase(name)) {
                   rank = (i + 1);
                   size = list.get(i).getNumber();
                }
            }
            if(rank == 0)System.out.println(name+ " is ranked not among "+ gender+" with "+ list.size() + " names");
            else System.out.println(name+ " is ranked " +rank+ " in popularity among "+gender+" with "+size+ " namings");
        }
    }


