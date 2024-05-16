import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

public class CountUppercaseWords {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        Predicate<String> hasUpperCase = w -> Character.isUpperCase(w.charAt(0));
        List<String> list = new ArrayList<>();
        int count = 0;
        for (String w : input){
            if(hasUpperCase.test(w)){
                list.add(w);
                count++;
            }
        }
        System.out.println(count);
        for (String w : list){
            System.out.println(w);
        }
    }

}
