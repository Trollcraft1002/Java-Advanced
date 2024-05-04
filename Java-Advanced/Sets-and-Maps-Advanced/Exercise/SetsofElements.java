import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class SetsofElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split("\\s+");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> setN = new LinkedHashSet<>();
        Set<Integer> setM = new LinkedHashSet<>();

        //creating the two sets
        while (n-- > 0) {
            String line = scanner.nextLine();
            setN.add(Integer.valueOf(line));
        }
        while (m-- > 0) {
            String line = scanner.nextLine();
            setM.add(Integer.valueOf(line));
        }

        Set<Integer> repeatingElements = new LinkedHashSet<>();
        //checking every value from set N and comparing it with setM
        for (int a : setN) {
            for (int b : setM){
                if (a == b){
                    repeatingElements.add(a);
                }
            }
        }
        //Printing the duplicates
        for (int a : repeatingElements) {
            System.out.print(a + " ");
        }
    }
}
