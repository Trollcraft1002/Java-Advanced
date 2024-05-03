import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class SoftUniParty {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //using TreeSet to sort the guest by VIP
        Set<String> guests = new TreeSet<>();

        //Filling the guest list
        String input = scanner.nextLine();
        while (!input.equals("PARTY")) {
            guests.add(input);
            input = scanner.nextLine();
        }

        //Checking if guess has came
        input = scanner.nextLine();
        while(!input.equals("END")){
            guests.remove(input);
            input = scanner.nextLine();
        }

        //Printing guest that didn't arrive
        System.out.println(guests.size());
        for (String guest : guests) {
            System.out.println(guest);
        }
    }
}
