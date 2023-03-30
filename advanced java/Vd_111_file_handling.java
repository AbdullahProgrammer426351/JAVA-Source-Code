import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Vd_111_file_handling {
    public static void main(String[] args) {
        // code to create a new file
        // File file = new File("file.txt");
        // try {
        // file.createNewFile();// to create new file
        // } catch (IOException e) {
        // System.out.println("Unable to creat this file");
        // e.printStackTrace();
        // }

        // code to write to file
        // try {
        // FileWriter fileWriter = new FileWriter("file.txt");
        // fileWriter.write("this is our first file from this java course \n okay now
        // bey");
        // fileWriter.close();
        // } catch (IOException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // }

        // reading a file
        // File file = new File("file.txt");
        // try {
        // Scanner sc = new Scanner(file);
        // while (sc.hasNextLine()) {
        // String line = sc.nextLine();
        // System.out.println(line);
        // }
        // sc.close();
        // } catch (FileNotFoundException e) {
        // // TODO Auto-generated catch block
        // e.printStackTrace();
        // System.out.println("File not found");
        // }

        // deleting a file
        File file = new File("file.txt");
        if (file.delete()) {
            System.out.println("I have deted : " + file.getName());
        } else {
            System.out.println("Some problem occured while deleting the file");
        }
    }
}
