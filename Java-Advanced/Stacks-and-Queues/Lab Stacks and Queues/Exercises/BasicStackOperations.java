package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.stream.Stream;

public class BasicStackOperations {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String[] nums = scanner.nextLine().split(" ");
        int pushMe  = Integer.parseInt(nums[0]); //element to be pushed
        int pops = Integer.parseInt(nums[1]); //number of pops
        int checkMe = Integer.parseInt(nums[2]); //element to be checked if it is present in the stack

        String[] input = scanner.nextLine().split(" ");

        ArrayDeque<Integer> stack = new ArrayDeque<>();

//        for (String element : input) {
//            stack.offer(Integer.valueOf(element));
//        }


        //if stack is empty return 0
        if(pushMe <= 0 ){
            System.out.println(0);
            return;
        }

        for (int i = 0; i < pushMe; i++) {
            stack.push(Integer.valueOf(input[i]));
        }

        for (int i = 0; i < pops; i++) {
            if(stack.isEmpty()){
                System.out.println(0);
                return;
            }
            stack.pop();
        }
        //check if number is present

        if(stack.contains(checkMe)){
            System.out.println(true);
        }
        else{
            if(stack.isEmpty()){
                System.out.println(0);
                return;
            }
            stack.stream().sorted();
            System.out.println(stack.getFirst());
        }
    }

}
