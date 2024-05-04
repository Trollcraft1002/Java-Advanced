import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PeriodicTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Set<String> chemicals = new TreeSet<>();
        while (n-- > 0) {
            String[] chemicalsInput = scanner.nextLine().split("\\s+");

            //IDE Suggestion is to use addAll
            chemicals.addAll(Arrays.asList(chemicalsInput));
        }
        for (String chemical : chemicals) {
            System.out.printf(chemical + " ");
        }
    }
}
