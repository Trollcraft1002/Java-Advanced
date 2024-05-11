import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortEvenNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = Arrays.stream(scanner.nextLine().split(", "))
                .map(Integer::parseInt)
                .filter(a -> a % 2 == 0)
                //judge doesn't support .toList
                .collect(Collectors.toList());


        System.out.println(list.stream()
                .map(String::valueOf).collect(Collectors.joining(", ")));

        System.out.println(list.stream().sorted().map(String::valueOf).collect(Collectors.joining(", ")));
    }
}