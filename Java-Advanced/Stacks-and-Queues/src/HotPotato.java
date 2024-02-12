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

        int repeatNumber = Integer.parseInt(scanner.nextLine());


        while(queue.size() > 1){
            for (int i = 1; i <= repeatNumber; i++) {
                if(i==repeatNumber){
                  String removedPerson = queue.pop();
                    System.out.println("Removed " + removedPerson);
                }
            }
        }
        System.out.println("Last is " + queue.pop());
    }
}
