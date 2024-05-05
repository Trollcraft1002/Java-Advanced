import java.util.LinkedHashMap;
import java.util.Scanner;

public class FixEmails {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        while (!input.equals("stop")){
            String name = input;
            String email = sc.nextLine();

            //adding only those without .com .uk and .us
            if(!email.toLowerCase().contains(".com") && !email.toLowerCase().contains(".uk") && !email.toLowerCase().contains(".us") ){
                map.put(name, email);
            }
            input = sc.nextLine();
        }
            //printing the output
        for (String key : map.keySet()){
            System.out.println(key + " -> " + map.get(key));
        }
    }
}