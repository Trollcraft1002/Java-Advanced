package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class HotPotato {
    public static void main(String[] args){

        ArrayDeque<String> queue = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        String[] names = scanner.nextLine().split(" ");
        for(String name: names){
            queue.offer(name);
        }

        int repeatNumber = Integer.parseInt(scanner.nextLine().strip());


       while (queue.size() > 1){
           for (int i = 1; i < repeatNumber; i++) {
               queue.offer(queue.poll());//removes the head and placing it behind of the queue.
           }
           System.out.printf("Removed %s%n", queue.poll()); //using poll instead of pop to remove the first person
       }
        System.out.printf("Last is %s", queue.poll());


//        while(queue.size() > 1){
//            for (int i = 1; i <= repeatNumber; i++) {
//                if(i==repeatNumber){
//                  String removedPerson = queue.pop();
//                    System.out.println("Removed " + removedPerson);
//                }
//            }
//        }
//        System.out.println("Last is " + queue.pop());
    }
}
