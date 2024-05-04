import java.util.*;

public class CountRealNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //mapping the input to an array
        double[] values = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToDouble(Double::parseDouble)
                .toArray();

        //using the linked map to keep the original order
        Map<Double, Integer> map = new LinkedHashMap<>();

        //mapping the keys(input) and checking if the map is already mapped so we could add +1 to it
        for (double value : values) {
            if (!map.containsKey(value)) {
                map.put(value, 1);
            } else {
                map.put(value, map.get(value) + 1);
            }

        }
        //Printing the map using for each with key and value
        map.forEach((k, v) -> System.out.printf("%.1f -> %d%n", k, v));
    }
}
