import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        int n = Integer.parseInt(scanner.nextLine()); //n of commands
        int i = 0;
        while (i < n){
            String[] input = scanner.nextLine().split(" ");
            int command = Integer.parseInt(input[0]);
            i++;

            switch (command){
                case 1://push
                    stack.push(Integer.valueOf(input[1]));
                    break;
                case 2://pop
                        stack.pop();
                    break;
                case 3: // print max
                    System.out.println(Collections.max(stack));
                    break;
            }

        }
    }
}
