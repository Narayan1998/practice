package filehandling;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class IOInput {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File myFile = new File("src/filehandling/xyz.txt");
        Scanner sc = new Scanner(myFile);
        ArrayList<String> list = new ArrayList<>();
        while (sc.hasNext()){
            list.add(sc.nextLine());
        }
        System.out.println(list);

//        BufferedReader br = new BufferedReader(new FileReader("src/filehandling/xyz.txt"));
//        System.out.println(br.readLine() + ", " + br.readLine() + ", " + br.readLine() + ".");
    }
}
