import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String result = null;

        ArrayDeque<String> queue = new ArrayDeque<>();
        while(!input.equals("print")){
            if(input.equals("cancel")){

                if(queue.isEmpty()){
                    System.out.println("Printer is on standby");
                }
                System.out.printf("Canceled " + queue.pollFirst());
            }else{
                queue.offer(input);
            }

            input = scanner.nextLine();
            if(input.equals("print")){
                break;
            }
        }
        
        System.out.println(result);
    }
}
