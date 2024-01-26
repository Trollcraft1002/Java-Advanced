import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] arr = input.split(" ");
        ArrayDeque<String> arrayDeque = new ArrayDeque<>(Arrays.asList(arr));

        System.out.println();;

        int sum = Integer.parseInt(arrayDeque.pop());
        while (!arrayDeque.isEmpty()){
            String command = arrayDeque.pop();
            int number = Integer.parseInt(arrayDeque.pop());

            switch (command){
                case "+":
                    sum += number;
                    continue;

                case "-":
                    sum -= number;
            }
        }
        System.out.println(sum);
    }
}
