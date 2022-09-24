package filehandling;

import java.io.*;
import java.util.Scanner;

public class ReadWrite {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File f = new File("xyz.txt");
        f.createNewFile();


        FileWriter writer = new FileWriter("xyz.txt");
        writer.write("public static void main(String[]\n args) throws FileNotFoundException,\n IOException");
        writer.close();


        File myFile = new File("xyz.txt");
        Scanner sc = new Scanner(myFile);
        while (sc.hasNext()){
            System.out.println(sc.nextLine());
        }
        sc.close();


    }
}
