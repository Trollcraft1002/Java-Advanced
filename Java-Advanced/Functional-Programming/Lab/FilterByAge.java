import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> users = new TreeMap<>();
        while (n-- <= 0){
           String[] input = scanner.nextLine().split(", ");
            users.put(input[0], Integer.parseInt(input[1]));
        }
        System.out.println(users.size());


    }
}
