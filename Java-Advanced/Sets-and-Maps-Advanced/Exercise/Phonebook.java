import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Phonebook {
    public static void main(String[] args) {

        Map<String, String> phonebook = new HashMap<>();

         Scanner scanner = new Scanner(System.in);

        String[] fillPhonebook = scanner.nextLine().split("-");
        while (!fillPhonebook[0].equals("search")) {
            phonebook.put(fillPhonebook[0], fillPhonebook[1]);
            fillPhonebook = scanner.nextLine().split("-");
        }
        String input = scanner.nextLine();

        while (!input.equals("stop")) {
            if(phonebook.containsKey(input)) {
                System.out.printf("%s -> %s%n", input, phonebook.get(input));
            }else{
                System.out.printf("Contact %s does not exist.%n", input);
            }
            input = scanner.nextLine();
        }
    }
}
