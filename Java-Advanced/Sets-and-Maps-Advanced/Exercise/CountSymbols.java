import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountSymbols {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        char[] symbols = input.toCharArray();
        Map<Character, Integer> charMap = new TreeMap<>();

        for (char a : symbols){
            if(!charMap.containsKey(a)){
                charMap.put(a, 1);
            }else{
                charMap.put(a, charMap.get(a) + 1);
            }
        }


        for (Map.Entry<Character, Integer> entry : charMap.entrySet()){
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
