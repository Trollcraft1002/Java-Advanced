import java.io.FileInputStream;
import java.io.FileOutputStream;


public class WriteToFile {
    public static void main(String[] args) {

        String path = "Java-Advanced/Streams-Files-and-Directories/Resources/input.txt";
        String fileToWritePath = "Java-Advanced/Streams-Files-and-Directories/Resources/02.WriteToFileOutput.txt";
        String ignore = ",,.,!,?.";
        try (FileInputStream fis = new FileInputStream(path)) {
            int byteRead = fis.read();
            while (byteRead != -1) {

                try (FileOutputStream fos = new FileOutputStream(fileToWritePath, true)) {
                    if ((char) byteRead != ',' && byteRead != '.' && byteRead != '!' && byteRead != '?')  {
                        fos.write(byteRead);
                    }
                }


                byteRead = fis.read();
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


    }
}
