import java.util.ArrayDeque;
import java.util.Scanner;

public class BrowserHistory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<String> arrayDeque = new ArrayDeque<String>();

        while (scanner.hasNext()){
            if (input.equals("back")) {
                if (arrayDeque.isEmpty() || arrayDeque.size() == 1) {
                    System.out.println("no previous URLs");
                } else {
                    arrayDeque.pop();
                    System.out.println(arrayDeque.peek());
                }
                input = scanner.nextLine();
                continue;
            } else {
                arrayDeque.push(input);
                System.out.println(input);
            }
            input = scanner.nextLine();
            if(input.equals("Home")){
                break;
            }

        }
    }
}