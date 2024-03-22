package Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();


        //1 + (2 - (2 + 3) * 4 / (3 + 1)) * 5
        //(2 + 3) - (2 + 3)
        String input = scanner.nextLine();

        char[] charArray = input.toCharArray();


        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (ch == '('){
                stack.push(i);
            } else if(ch == ')'){
                int startIndex = stack.pop();
                String contents = input.substring(startIndex, i+1);
                System.out.println(contents);
            }
        }
    }
}
