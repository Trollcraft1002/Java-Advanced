import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Predicate;

public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        Map<String, Integer> users = new TreeMap<>();
        while (n-- != 0){
           String[] input = scanner.nextLine().split(", ");
            users.put(input[0], Integer.parseInt(input[1]));
        }


        for (Map.Entry<String, Integer> user : users.entrySet()){
            System.out.println(user.getKey() + " " + user.getValue());
        }


    }
}
