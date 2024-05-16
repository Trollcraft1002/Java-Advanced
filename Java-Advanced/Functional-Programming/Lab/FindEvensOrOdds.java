import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.function.Predicate;

public class FindEvensOrOdds {
    public static Predicate<Integer> even = x -> x % 2 == 0;
    public static Predicate<Integer> odd = x -> x % 2 == 1;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        int[] range = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        String condition = sc.nextLine();
        LinkedList<Integer> list;
        if(condition.equals("odd")){
            list = new LinkedList<>(oddNumbers(range));
        }else{
            list =  new LinkedList<>(evenNumbers(range));
        }
        for (int i : list.stream().mapToInt(Integer::valueOf).toArray()) {
            System.out.print(i + " ");
        }
    }

    public static LinkedList<Integer> evenNumbers (int[] range){
        LinkedList<Integer> List = new LinkedList<>();

            for (int i = range[0]; i <= range[1]; i++) {
                if (even.test(i)) {
                    List.add(i);
                }
            }
            return List;
    }

    public static LinkedList<Integer> oddNumbers (int[] range){
        LinkedList<Integer> List = new LinkedList<>();
        for (int i = range[0]; i <= range[1]; i++) {
            if (odd.test(i)) {
                List.add(i);
            }
        }
        return List;
    }
}
