import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class UserLogs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        TreeMap<String,LinkedHashMap<String, Integer>> users = new TreeMap<>();
        while (!input.contains("end")){


            String[] info = input.split(" ");


            String ip = info[0].replace("IP=", "");
            String username = info[2].replace("user=", "");

            if(!users.containsKey(username)){

                users.put(username,new LinkedHashMap<>());
                users.get(username).put(ip,1);

            }else{

                if(users.get(username).containsKey(ip)){
                    users.get(username).put(ip,users.get(username).get(ip)+1);
                }else{
                    users.get(username).put(ip,1);
                }
            }
            input = scanner.nextLine();
        }
        //little messy but it will do the job
        for (String key : users.keySet()) {
            System.out.println(key + ":");
            String ips = String.join(" ", users.get(key).toString()).replace("=", " => ").replace("{", " ").replace("}", "");
            System.out.printf("%s.%n", ips);
        }
    }
}
