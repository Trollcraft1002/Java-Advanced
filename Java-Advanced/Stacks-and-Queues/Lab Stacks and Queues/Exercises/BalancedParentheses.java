import java.util.ArrayDeque;
import java.util.Scanner;

public class BalancedParentheses {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        //Adding the first half to the queue (replaced for with addAll and then using list with SubList)
        ArrayDeque<Character> queue = new ArrayDeque<>();

        if(input.length() % 2 != 0){
            System.out.println("NO");
            return;
        }
        for (int i = 0; i < input.length(); i++) {
            char current = input.charAt(i);
            if(current == '(' ||current == '[' ||current == '{'){
                queue.push(current);
            }else{
                if(queue.isEmpty()){
                    System.out.println("NO");
                    return;
                }

                char lastOpeningBracket = queue.pop();
                if (current == '}' && lastOpeningBracket != '{') {
                    System.out.println("NO");
                    return;
                } else if (current == ')' && lastOpeningBracket != '(') {
                    System.out.println("NO");
                    return;
                }  else if (current == ']' && lastOpeningBracket != '[') {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(queue.isEmpty()) {
            System.out.println("YES");
        }
    }
}
