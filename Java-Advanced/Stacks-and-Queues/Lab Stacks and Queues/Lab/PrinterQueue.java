package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        StringBuilder result = new StringBuilder();

        ArrayDeque<String> queue = new ArrayDeque<>();
        while(!input.equals("print")){
            if(input.equals("cancel")){

                if(queue.isEmpty()){
                    //System.out.println("Printer is on standby");
                    result.append("Printer is on standby\n");
                }else {
                    //System.out.printf("Canceled " + queue.pollFirst());
                    result.append("Canceled ").append(queue.pollFirst()).append("\n");
                }
            }else{
                queue.offer(input);
            }

            input = scanner.nextLine();
            if(input.equals("print")){
                if(!queue.isEmpty()){
                    for (String que:queue) {
                        result.append(que).append("\n");
                    }
                }
                break;
            }
        }
        System.out.println(result);

    }
}