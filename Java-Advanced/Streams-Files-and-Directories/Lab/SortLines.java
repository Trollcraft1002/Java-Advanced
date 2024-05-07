import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SortLines {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String inputPath = "Java-Advanced/Streams-Files-and-Directories/Resources/input.txt";
        String outputPath = "Java-Advanced/Streams-Files-and-Directories/Resources/06.SortLinesOutput.txt";


        try{
            FileWriter fileWriter = new FileWriter(outputPath, true);
            Files.lines(Path.of(inputPath)).sorted().forEach(line -> {
                try {
                    fileWriter.write(line + "\n");
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        }
        catch(IOException e){
            System.out.println("File not found");
        }
    }
}
