import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(", "))
                .mapToInt(Integer::parseInt).toArray();

        //found how to use them
        Function<int[], String> count = nums -> "Count = " + Arrays.stream(nums).count();
        Function<int[], String> sum = nums -> "Sum = " + Arrays.stream(nums).sum();

        System.out.println(count.apply(numbers));
        System.out.println(sum.apply(numbers));


    }
}
