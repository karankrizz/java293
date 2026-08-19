import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Day9P1 {
    public static void main(String[] args) {
        File file = new File("Day10.txt");

        System.out.println("\n [1] CREATE A FILE WORKOUT");
        try {
        if (file.createNewFile()) {
        System.out.println(" File is successfully created");
         } else {
        System.out.println(" Given file name already exists");
        }

        } catch (IOException e) {
        System.out.println("Error" + e.getMessage());
        }

        // System.out.println("\n[2] FILE DELETION WORKOUT");
        // if (file.delete()) {
        //     System.out.println("File is successfully deleted");
        // } else {
        //     System.out.println("File not found");
        // }
        
        System.out.println("\n[3]  ACCESS THE FILE NAME AND FILE ABSOLUTE PATH");
        System.out.println("\nAbsolute path:" + file.getAbsoluteFile());
        System.out.println("File Name : " + file.getName());

        System.out.println("\n[4]WORKOUT OF WRITING A CONTENT IN THE FILE ");
        try {
            FileWriter writer = new FileWriter("Day10.txt");
            writer.write("HELLO WORLD");
            writer.close();
            System.out.println("Data written succesfully");

        } catch (IOException e) {
            System.out.println("Error :" + e.getMessage());
        }
    }
}
