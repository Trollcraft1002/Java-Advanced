package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        Scanner scanner = new Scanner(System.in);

        int decimal = Integer.parseInt(scanner.nextLine());
        if(decimal == 0) System.out.println(0);

        while (decimal != 0 ){
           stack.push(decimal % 2);
           decimal /=2;
        }

        while(!stack.isEmpty()) {
            System.out.printf(String.valueOf(stack.pop()));
        }
    }
}
