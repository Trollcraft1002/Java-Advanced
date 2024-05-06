import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) {
        String path = "C:\\Users\\CRAFT\\IdeaProjects\\Java-Advanced\\Java-Advanced\\Streams-Files-and-Directories\\Resources\\input.txt";
        try (FileInputStream fileStream = new FileInputStream(path)){
            int bytesRead = fileStream.read();

            while(bytesRead != -1){
                System.out.print( Integer.toBinaryString(bytesRead) +" ");
                bytesRead = fileStream.read();
            }
        }
        catch (IOException e) {
            System.out.println("File not found");
        }
    }
}
