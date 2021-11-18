package Q1;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String boysPath = "files\\boynames.txt" ;
        String  girlsPath= "files\\girlnames.txt";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ana name");
        String name  = sc.nextLine();

        ranking(girlsPath, name,"girls");
       ranking(boysPath,name, "boys");

    }


    public static void ranking(String path,String name, String gender){

        List<Person> personList =new ArrayList<>();
        String data = "";
        String[] arr=null;
        File file = new File(path);
        try {
            FileReader freader =new FileReader(file);
            BufferedReader breader = new BufferedReader(freader);
            while((data = breader.readLine()) !=null){
                arr = data.split(" ");
                Person p = new Person(arr[0], Integer.parseInt(arr[1]));
                personList.add(p);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(personList);
            int rank =0;
            int number=0;

        for (int i=0; i< personList.size(); i++) {
            if(name.equalsIgnoreCase(personList.get(i).getName())){
                    rank = i;
                    number = personList.get(i).getNum();

            }

        }
        if(rank == 0){
            System.out.println(name + " is not ranked among the top " + personList.size() +" " + gender + " names");

        }else System.out.println(name + " is  ranked "+ rank+" among the top " + number +" " + gender + " naming");


    }



}
