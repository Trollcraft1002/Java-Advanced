import java.util.*;

public class ParkingLot {
    public static void main(String[] args) {

        Set<String> cars = new LinkedHashSet<>();

        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(", ");


        while (!input[0].equals("END")) {
            String command = input[0];

            switch (command) {
                case "IN":
                    cars.add(input[1]);
                    break;

                case "OUT":
                    cars.remove(input[1]);
                    break;

            }
            input = scanner.nextLine().split(", ");
        }
        if (cars.isEmpty()) {
            System.out.println("Parking Lot is Empty");
        } else {
            cars.forEach(System.out::println);
        }
    }
}
