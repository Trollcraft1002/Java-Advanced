import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;


public class FilterByAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> users = new LinkedHashMap<>();

        while (n-- != 0){
           String[] input = scanner.nextLine().split(", ");
            users.put(input[0], Integer.parseInt(input[1]));
        }

        String condition = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());

        Map<String, Integer> newMap = new LinkedHashMap<>();
        if(condition.equals("younger")){
            newMap = youngerMap(users, age);
        }
        else
            if (condition.equals("older")){
                newMap = olderMap(users, age);
        }

            String format = scanner.nextLine();

            switch (format){
                case "name age":
                    for (Map.Entry<String, Integer> entry : newMap.entrySet()){
                        System.out.println(entry.getKey() + " - " + entry.getValue());
                    }
                    break;
                case "name":
                        for (Map.Entry<String, Integer> entry : newMap.entrySet()){
                            System.out.println(entry.getKey());
                        }
                    break;
                case "age":
                    for (Map.Entry<String, Integer> entry : newMap.entrySet()){
                        System.out.println(entry.getValue());
                    }
                    break;
            }
    }

    public static Map<String, Integer> olderMap(Map<String, Integer> users, int age){
        Map<String, Integer> olderMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : users.entrySet()) {
            if (entry.getValue() >= age){
                olderMap.put(entry.getKey(), entry.getValue());
            }
        }
        return olderMap;
    }

    public static Map<String, Integer> youngerMap(Map<String, Integer> users, int age){
        Map<String, Integer> youngerMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : users.entrySet()){
            if (entry.getValue() <= age){
                youngerMap.put(entry.getKey(), entry.getValue());
            }
        }
        return youngerMap;
    }

}
