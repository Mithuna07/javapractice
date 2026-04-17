package filehandling;

import java.io.*;
import java.util.Scanner;
import java.io.IOException;

public class fileexample {
public static void main(String[] args){
    File fi = new File("newfile.txt");
    try{
        if(fi.createNewFile()){
            System.out.println("file  created" + fi.getName());
        }
        else{
            System.out.println("file already exists");
        }
        FileWriter writer = new FileWriter("newfile.txt");
        writer.write("hello\n");
        writer.write("writing in a file");
        writer.close();

        FileReader reader = new FileReader("newfile.txt");
        Scanner scan = new Scanner(reader);
        while(scan.hasNextLine()){
            System.out.println(scan.nextLine());
        }
        scan.close();
        reader.close();

    }
    catch(IOException e){
        System.out.println("error occurred");
        e.printStackTrace();
    }


}
}
