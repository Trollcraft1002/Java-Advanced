import java.io.*;

public class WriteEveryThirdLine {
    public static void main(String[] args) {

        String filePath = "Java-Advanced/Streams-Files-and-Directories/Resources/input.txt";
        String output = "Java-Advanced/Streams-Files-and-Directories/Resources/05.WriteEveryThirdLineOutput.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            int currentLine = 1;

            while ((line = reader.readLine()) != null) {
                if (currentLine % 3 == 0) {

                    try(FileWriter fileWriter = new FileWriter(output, true)) {
                        fileWriter.append(line).append(System.lineSeparator());
                    }
                }
                currentLine++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
