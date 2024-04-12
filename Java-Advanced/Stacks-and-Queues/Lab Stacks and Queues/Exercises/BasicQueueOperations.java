import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class BasicQueueOperations {
    public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            int[] nsx = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int n = nsx[0]; // N representing the number of elements to enqueue (add)
            int s = nsx[1]; // S representing the number of elements to dequeue (remove/poll)
            int x = nsx[2]; // X, an element that you should check whether is present in the queue.


        ArrayDeque<Integer> queue = new ArrayDeque<>();

        int[] input = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        
        
        //Here we are doing N
        for (int i = 0; i < n ; i++) {
            queue.add(input[i]);
            //System.out.println(queue);
        }
        
        //Here we are doing S
        for (int i = 0; i < s; i++) {
            queue.poll();
        }

        //Here we are doing X
        if(queue.contains(x)){
            System.out.println(true);
            return;
        }

        if(queue.isEmpty()){
            System.out.println(0);
            return;
        }

        System.out.println(Collections.min(queue));

    }
}
