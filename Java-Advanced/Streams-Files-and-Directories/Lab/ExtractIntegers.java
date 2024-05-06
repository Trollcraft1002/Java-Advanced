import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ExtractIntegers {
    public static void main(String[] args) {

        String path = "Java-Advanced/Streams-Files-and-Directories/Resources/input.txt";
        String output = "Java-Advanced/Streams-Files-and-Directories/Resources/04.ExtractIntegersOutput.txt";

        try {
            Scanner scanner = new Scanner(new FileInputStream(path));



            while(scanner.hasNext()){
                try(FileOutputStream fos = new FileOutputStream(output, true)){
                    if(scanner.hasNextInt()){
                        //after hours of trying to append or get numbers in the file i got this solution for the internet where we convert int to byte[]
                        int number = scanner.nextInt();
                        byte[] bytes = Integer.toString(number).getBytes();
                        fos.write(bytes);
                        fos.write("\n".getBytes());
                    }
                    scanner.next();
                }

            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
