package Exercises;

import java.util.ArrayDeque;
import java.util.Scanner;

public class ReverseNumberWithStack {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        String[] input = scanner.nextLine().split(" ");

        for (String number : input) {
            stack.push(Integer.valueOf(number));
        }

        for (int number : stack) {
            System.out.printf("%d ", number);
        }

    }
}
