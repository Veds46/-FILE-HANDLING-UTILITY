
import java.io.*;

public class createfile {

    public static void main(String[] args) {
        String fileName = "demoo.txt";
        String contentToWrite = "This is a sample text for the file.";

        try {
            
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            
            FileWriter writer = new FileWriter(fileName);
            writer.write("Vedant chougule , roll no-13,Applied for codetech intern");
            writer.close();
            System.out.println("File written succesfully");
            

            FileWriter appender = new FileWriter(fileName, true);
            appender.write("\nThis is an additional line added to the file.");
            appender.close();
            System.out.println("File modified successfully.");

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
